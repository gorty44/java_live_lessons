package interfaces;

public class CompanyEmployee implements Company, Employee {
	private String first;
	private String last;
	
	public CompanyEmployee(String first, String last) {
		this.first = first;
		this.last = last;
	}
	
	// class always overrides interface
	// if there is conflict between two default methods from different interfaces
	// you must provide implementation in class to resolve the conflict.
	@Override
	public String getName() {
		return Company.super.getName() + " " + Employee.super.getName();
	}

	@Override
	public String getFirst() {
		return first;
	}

	@Override
	public String getLast() {
		return last;
	}

	@Override
	public void doWork() {
		System.out.println("Praca praca.");
	}

	public static void main(String[] args) {
		CompanyEmployee ce = new CompanyEmployee("first", "last");
		System.out.println(ce.getName());
	}
}

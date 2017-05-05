package wildcards;

public class Salaried extends Employee {
	public static final double DEFAULT_SALARY = 120_000;

	private double salary = DEFAULT_SALARY;

	public Salaried() {
		//super(Employee.DEFAULT_NAME);
		// OR constructor with 2 arguments explicitly calls parent class'es constructor
		this(Employee.DEFAULT_NAME, Salaried.DEFAULT_SALARY);
	}

	public Salaried(String name) {
		this(name, DEFAULT_SALARY);
	}

	public Salaried(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

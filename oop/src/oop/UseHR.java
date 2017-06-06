package oop;

public class UseHR {
	public static void main(String[] args) {
		HR hr = new HR();
		hr.hire(new Salaried("FRODO"));
		hr.hire(new Hourly("GANDALF"));
		hr.hire(new Salaried());
		hr.hire(new Hourly());
		hr.printEverybody();
		hr.payEverybody();
	}
}
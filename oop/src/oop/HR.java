package oop;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class HR {
	private List<Employee> employees = new ArrayList<>();

	public void hire(Employee e) {
		employees.add(e);
	}

	public void layoff(Employee e) {
		employees.remove(e);
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void printEverybody() {
		employees.forEach(System.out::println);
		// OR
		// employees.forEach(e -> System.out.println(e));
	}

	public void payEverybody() {
		employees.stream().forEach(e -> System.out.printf("Paying %s %s%n", e.getName(),
				NumberFormat.getCurrencyInstance().format(e.getPay())));
	}

}

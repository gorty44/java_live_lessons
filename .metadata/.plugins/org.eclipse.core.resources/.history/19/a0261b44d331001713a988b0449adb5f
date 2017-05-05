package wildcards;

import java.util.Arrays;
import java.util.List;

public class HRDemo {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Dawid"), new Employee("Klaudia"), new Employee("Emil"),
				new Employee("Random"));
		HR.printEmpNames(employees);

		List<Salaried> salarieds = Arrays.asList(new Salaried("Dawid"), new Salaried("Klaudia"), new Salaried("Emil"),
				new Salaried("Random"));
		// Even though Salaried extends Employee the code below won't compile
		// HR.printEmpNames(salarieds);

		HR.printEmpAndSubclassNames(salarieds);

		HR.printAllFiltered(employees, e -> e.getName().length() % 2 == 0);
	}
}

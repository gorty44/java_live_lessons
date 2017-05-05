package oop;

import java.time.LocalDate;

public abstract class Employee {
	public static final String DEFAULT_NAME = "UNKNOWN";
	private static int nextId;

	private Integer id;
	private String name;
	private LocalDate hireDate;

//	public Employee() {
//		this(DEFAULT_NAME);
//	}

	public Employee(String name) {
		this.name = name;
		this.id = nextId++;
		this.hireDate = LocalDate.now();
	}

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double getPay();
	
	@Override
	public String toString() {
		return String.format("Employee{id=%d, name='%s', hireDate=%s}", id, name, hireDate);
	}
	
	
}

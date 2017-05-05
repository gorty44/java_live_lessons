package interfaces;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
	private int id;
	private LocalDate startDate = LocalDate.now();
	private LocalDate endDate = LocalDate.now();
	private String name;
	private int priority;
	private boolean completed;

	public Task() {
	}

	public Task(int id, String name, int priority) {
		this(id, name, LocalDate.now(), LocalDate.now(), priority, false);
	}

	public Task(int id, String name, LocalDate startDate, LocalDate endDate, int priority, boolean completed) {
		this.id = id;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priority = priority;
		this.completed = completed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return String.format("Task{id=%d, name=%s, startDate=%s, endDate=%s, priority=%d, completed=%s", id, name,
				startDate, endDate, priority, completed);
	}

	@Override
	public int compareTo(Task task) {
		return this.priority - task.priority;
	}
}

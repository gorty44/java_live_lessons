package wildcards;

public interface Repairable {
	default void repair() {
		System.out.println("Repairing " + this.getClass().getName());
	}
}

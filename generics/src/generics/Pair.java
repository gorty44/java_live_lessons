package generics;

public class Pair<T> {
	private T first;
	private T second;

	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}

	public Pair<T> swap() {
		return new Pair<T>(second, first);
	}

	public static <T> void swap(Pair<T> pair) {
		T temp = pair.first;
		pair.first = pair.second;
		pair.second = temp;
	}
}

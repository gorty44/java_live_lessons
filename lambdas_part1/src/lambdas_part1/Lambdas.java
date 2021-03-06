package lambdas_part1;

import java.util.Arrays;
import java.util.Comparator;

public class Lambdas {
	public static void main(String[] args) {
		String[] array = { "one", "two", "three", "four" };

		sortMethod(array, (s1, s2) -> s1.length() - s2.length());
		sortMethod(array, (s1, s2) -> s2.length() - s1.length());
		sortMethod(array, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		sortMethod(array, (s1, s2) -> {
			if (s1.contains("e")) {
				return -1;
			}
			return 1;
		});

		sortMethod(array, (s1, s2) -> Lambdas.helperMethod(s1));
	}

	private static void sortMethod(String[] array, Comparator<String> c) {
		Arrays.sort(array, c);
		System.out.println(Arrays.asList(array));
	}

	private static int helperMethod(String s1) {
		if (s1.contains("e")) {
			return -1;
		}
		return 1;
	}
}

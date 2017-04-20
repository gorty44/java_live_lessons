package lambdas_part2;

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
		// W związku z tym, że sygnatura helperMethod pasuje do sygnatury compare z Comparatora
		// mogę skorzystać z method reference typu ClassName::staticMethod
		sortMethod(array, Lambdas::helperMethod);
	}

	private static void sortMethod(String[] array, Comparator<String> c) {
		Arrays.sort(array, c);
		System.out.println(Arrays.asList(array));
	}

	private static int helperMethod(String s1, String s2) {
		if (s1.contains("e")) {
			return -1;
		}
		return 1;
	}
}

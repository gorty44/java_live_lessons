package lambdas_part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExercise {
	public static List<String> allMatches(List<String> list, Predicate<String> predicate) {
		List<String> matches = new ArrayList<>();
		for (String possibleMatch : list)
			if (predicate.test(possibleMatch))
				matches.add(possibleMatch);
		return matches;
	}

	public static <T> List<T> allMatchesGeneric(List<T> list, Predicate<T> predicate) {
		List<T> matches = new ArrayList<>();
		for (T possibleMatch : list)
			if (predicate.test(possibleMatch))
				matches.add(possibleMatch);
		return matches;
	}

	private static <T> void allMatchesTestGeneric(List<T> list, Predicate<T> predicate) {
		System.out.println(allMatchesGeneric(list, predicate));
	}

	private static void allMatchesTest(List<String> list, Predicate<String> predicate) {
		System.out.println(allMatches(list, predicate));
	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hi", "hello", "whatsover", "bye", "blabla");

		allMatchesTest(words, s -> s.contains("b"));
		allMatchesTest(words, s -> s.length() < 4);
		allMatchesTest(words, s -> (s.length() % 2) == 0);

		System.out.println("========");
		System.out.println("Generics");
		System.out.println("========");

		allMatchesTestGeneric(words, s -> s.contains("b"));
		allMatchesTestGeneric(words, s -> s.length() < 4);
		allMatchesTestGeneric(words, s -> (s.length() % 2) == 0);

		System.out.println("Class other than string:");
		allMatchesTestGeneric(Arrays.asList(1, 10, 100, 1000, 10000), n -> n > 500); // works as well

	}
}

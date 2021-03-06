package lambdas_part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExercise {
	public static List<String> transformedList(List<String> input, Function<String, String> function) {
		List<String> matches = new ArrayList<>();
		for (String in : input)
			matches.add(function.apply(in));

		return matches;

	}

	public static <T, R> List<R> transformedListGeneric(List<T> input, Function<T, R> function) {
		List<R> matches = new ArrayList<>();
		for (T in : input)
			matches.add(function.apply(in));
		return matches;
	}

	private static <T, R> void transformedListTestGeneric(List<T> input, Function<T, R> function) {
		System.out.println(transformedListGeneric(input, function));
	}

	private static void transformedListTest(List<String> input, Function<String, String> function) {
		System.out.println(transformedList(input, function));
	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hi", "hello", "whatsover", "bye", "blabla");

		transformedListTest(words, s -> s.toUpperCase());
		transformedListTest(words, s -> s + "!");
		transformedListTest(words, s -> s.replace("i", "eye"));
		transformedListTest(words, String::toUpperCase);

		System.out.println("========");
		System.out.println("Generics");
		System.out.println("========");

		transformedListTestGeneric(words, s -> s.toUpperCase());
		transformedListTestGeneric(words, s -> s + "!");
		transformedListTestGeneric(words, s -> s.replace("i", "eye"));
		transformedListTestGeneric(words, String::toUpperCase);

		System.out.println("With other type of input:");
		transformedListTestGeneric(Arrays.asList(1, 2, 3, 4, 5, 6), i -> 2 * i);
		transformedListTestGeneric(words, String::length);
	}
}

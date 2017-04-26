package streams_part1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hey", "hi", "hello", "bye", "goodbye");
		// ================= 1
		list.stream().forEach(e -> System.out.println("  " + e));
		// ================= 2
		list.stream().forEach(System.out::println);
		// ================= 3 using map
		List<String> excitingWords = list.stream().map(e -> e + "!").collect(Collectors.toList());
		System.out.println(excitingWords);

		List<String> eyeWords = list.stream().map(e -> e.replace("i", "eye")).collect(Collectors.toList());
		System.out.println(eyeWords);

		String[] stringArray = { "hey", "hi", "hello", "bye", "goodbye" };
		String[] upperCaseWords = Stream.of(stringArray).map(String::toUpperCase).toArray(String[]::new);
		System.out.println(Arrays.asList(upperCaseWords));
		// ================= 4 using filter
		List<String> shortWords = list.stream().filter(e -> e.length() < 4).collect(Collectors.toList());
		System.out.println(shortWords);

		String[] wordsWithB = Stream.of(stringArray).filter(e -> e.contains("b")).toArray(String[]::new);
		System.out.println(Arrays.asList(wordsWithB));

		List<String> evenLengthWords = list.stream().filter(e -> (e.length() % 2) == 0).collect(Collectors.toList());
		System.out.println(evenLengthWords);

		// ================= 5
		Stream.of("raz", "dwa", "trzy", "cztery", "piec").map(String::toUpperCase).filter(e -> e.length() < 7)
				.filter(e -> e.contains("E")).findFirst().ifPresent(System.out::println);

		// ================= 6 Lazy evaluation proof
		Stream.of("raz", "dwa", "trzy", "cztery", "piec").map(e -> {
			System.out.println("In upperCase");
			return e.toUpperCase();
		}).filter(e -> {
			System.out.println("In length check");
			return (e.length() < 7);
		}).filter(e -> {
			System.out.println("In contains \"E\"");
			return e.contains("E");
		}).findFirst().ifPresent(System.out::println);

	}
}

package lambds_part4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPreview {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("hi", "hello", "bye", "goodbye");
		String s1 = words.stream().filter(word -> word.contains("o")).findFirst().orElse(null);
		System.out.println(s1);
		String s2 = words.stream().filter(word -> word.length() > 5).findFirst().orElse(null);
		System.out.println(s2);

		Stream<String> s3 = words.stream().map(word -> word.toUpperCase());
		s3.forEach(System.out::println);
	}
}
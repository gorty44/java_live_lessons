package lambds_part4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionUtils {
	@SafeVarargs
	public static <T> T firstAllMatch(Stream<T> stream, Predicate<T>... predicates) {
		Predicate<T> predicate = passAllPredicates(predicates);
		return stream.filter(predicate).findFirst().orElse(null);
	}

	@SafeVarargs
	private static <T> Predicate<T> passAllPredicates(Predicate<T>... predicates) {
		Predicate<T> result = predicates[0];
		for (int i = 1; i < predicates.length; i++)
			result = result.and(predicates[i]);
		return result;
	}

	@SafeVarargs
	public static <T> T firstAnyMatch(Stream<T> stream, Predicate<T>... predicates) {
		Predicate<T> predicate = passAnyPredicates(predicates);
		return stream.filter(predicate).findFirst().orElse(null);
	}

	@SafeVarargs
	private static <T> Predicate<T> passAnyPredicates(Predicate<T>... predicates) {
		Predicate<T> result = predicates[0];
		for (int i = 1; i < predicates.length; i++)
			result = result.or(predicates[i]);
		return result;
	}

	@SafeVarargs
	private static <T> void testingMethodAll(Stream<T> stream, Predicate<T>... predicates) {
		System.out.println(firstAllMatch(stream, predicates));
	}

	@SafeVarargs
	private static <T> void testingMethodAny(Stream<T> stream, Predicate<T>... predicates) {
		System.out.println(firstAnyMatch(stream, predicates));
	}

	public static void main(String[] args) {
		List<String> words = Arrays.asList("hello", "hi", "goodbye", "bye", "czternascie");
		testingMethodAll(words.stream(), word -> word.contains("e"), word -> word.length() > 8);
		testingMethodAny(words.stream(), word -> word.contains("e"), word -> word.length() > 8);
	}
}

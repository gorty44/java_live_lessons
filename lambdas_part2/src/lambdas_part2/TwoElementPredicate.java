package lambdas_part2;

@FunctionalInterface
public interface TwoElementPredicate<T> {
	boolean predicate(T t1, T t2);
}

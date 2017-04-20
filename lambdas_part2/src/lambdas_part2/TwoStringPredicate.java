package lambdas_part2;

@FunctionalInterface
public interface TwoStringPredicate {
	boolean predicate(String s1, String s2);
}

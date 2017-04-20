package lambdas_part2;

public class StringUtils {
	private static String betterString(String s1, String s2, TwoStringPredicate tsp) {
		if (tsp.predicate(s1, s2) == true)
			return s1;
		return s2;
	}

	public static void main(String[] args) {
		String s1 = "ONE";
		String s2 = "THREE";
		
		// Nie mogę używać tych samych nazw z zakresu w lambdach, stąd x i y
		String longer = StringUtils.betterString(s1, s2, (x, y) -> x.length() > y.length());
		// To samo
		String first = StringUtils.betterString(s1, s2, (x, y) -> true);
		System.out.println("First one: " + first + ", longer one: " + longer);
	}
}

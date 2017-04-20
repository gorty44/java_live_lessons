package lambdas_part2;

public class ElementUtils<T> {
	private static <T> T betterEntry(T t1, T t2, TwoElementPredicate<T> tem) {
		if (tem.predicate(t1, t2))
			return t1;
		return t2;
	}
	
	public static void main(String[] args) {
		String s1 = "ONE";
		String s2 = "THREE";
		String result = ElementUtils.betterEntry(s1, s2, (x, y) -> x.length() > y.length());
		
		System.out.println(result.concat(result));
	}

}

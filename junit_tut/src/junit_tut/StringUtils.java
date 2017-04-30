package junit_tut;

public class StringUtils {
	public static String reverseString(String s) {
		return (new StringBuilder(s)).reverse().toString();
	}

	public static boolean isPalindrome(String s) {
		return s.equalsIgnoreCase(StringUtils.reverseString(s));
	}

	private StringUtils() {
	}
}

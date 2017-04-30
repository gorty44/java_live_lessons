package junit_tut;

import java.util.ArrayList;
import java.util.List;

public class GovernmentUtils {
	public static String calmString(String s) {
		if (s == null)
			return null;
		return s.replaceAll("!", "");
	}

	public static List<String> calmAttendees(List<String> attendees) {
		if (attendees == null)
			return null;
		ArrayList<String> copy = new ArrayList<>(attendees);
		if (attendees.contains("Republican") && attendees.contains("Democrat")) {
			double random = Math.random();
			if (random >= 0.5)
				copy.remove("Republican");
			else
				copy.remove("Democrat");
			return copy;
		}
		return attendees;
	}

	private GovernmentUtils() {
	}
}

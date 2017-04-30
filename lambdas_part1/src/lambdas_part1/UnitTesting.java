package lambdas_part1;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class UnitTesting {
	@Test
	public void betterEntryTest() {
		String s1 = "xxxx";
		String s2 = "xxx";
		assertThat(s1, is(equalTo(ElementUtils.betterEntry(s1, s2, (x, y) -> s1.length() > s2.length()))));
		assertThat(s2, is(equalTo(ElementUtils.betterEntry(s1, s2, (x, y) -> x.length() < y.length()))));
	}
}

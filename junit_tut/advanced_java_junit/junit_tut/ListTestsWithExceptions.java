package junit_tut;

import java.util.Arrays;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class ListTestsWithExceptions {
	private List<String> strings = Arrays.asList("this", "is", "a", "list", "of", "strings");

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void defaultListHasSixStrings() {
		assertThat(strings.size(), is(6));
	}

	@Test // old JUnit style
	public void nullListThrowsNPEOldStyle() {
		strings = null;
		try {
			strings.add("Hello");
			fail("Should have thrown a NPE");
		} catch (NullPointerException e) {
			assertThat(strings, is(nullValue()));
		}
	}

	// new JUnit style
	@Test(expected = NullPointerException.class)
	public void nullListThrowsNPE() {
		strings = null;
		strings.add("hello");
	}

	@Test
	public void nullListThrowsNPEUsingRule() {
		String[] stringArray = strings.toArray(new String[0]);
		thrown.expect(ArrayIndexOutOfBoundsException.class);
		thrown.expectMessage("7");
		System.out.println(stringArray[7]);
	}
}

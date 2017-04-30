package junit_tut;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UnitTests {

	@Test
	public void testCalmString() {
		assertThat("calm", is(equalTo(GovernmentUtils.calmString("!calm!"))));
		assertThat("calm", is(equalTo(GovernmentUtils.calmString("calm"))));
		assertThat(null, is(equalTo(GovernmentUtils.calmString(null))));
	}

	@Test
	public void testCalmAttendees() {
		assertThat(GovernmentUtils.calmAttendees(Arrays.asList("Republican", "Democrat")),
				anyOf(hasItem("Republican"), hasItem("Democrat")));
		List<String> attendees = Arrays.asList("Republican", "Republican");
		assertThat(GovernmentUtils.calmAttendees(attendees), is(equalTo(attendees)));
		attendees = Arrays.asList("Democrat", "Democrat");
		assertThat(GovernmentUtils.calmAttendees(attendees), is(equalTo(attendees)));
		assertThat(GovernmentUtils.calmAttendees(null), is(nullValue()));
	}

}

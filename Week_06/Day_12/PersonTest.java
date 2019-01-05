package Week_06.Day_12;

import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(expected, output);
		// test 02
		//
	}

	@Test
	public void testDoubleSpace() {
		Person q = new Person();
		String input = "  ";
		String output = q.getInitials(input);
		String expected = "  ";
		assertTrue(expected != output);
		//
		//
		// test 9,999,999 you get idea
		//fail();
	}
}


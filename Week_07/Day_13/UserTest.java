package Day_13;

import org.junit.*;
import static org.junit.Assert.*;

public class UserTest {
	@Test
	public void testGetName() {
		User user = new UserImpl("Karl Marx");
		String output = user.getName();
		String expected = "Karl Marx";
		assertEquals(expected, output);
	}

	@Test
	public void testGetId() {
		User user = new UserImpl("Karl Marx");
		int output = user.getId();
		int expected = -1;
		assertEquals(expected, output);
	}

	@Test
	public void testLibrary() {
		User user = new UserImpl("John Smith");
		Library theLibrary = new LibraryMock();
		user.register(theLibrary);
		int output = user.getId();
		int expected = 13;
		assertEquals(expected, output);
	}

	@Test
	public void getLibrary() {
		User user = new UserImpl("John Smith"); // not doing anything with name so can pass same one
		Library theLibrary = new LibraryMock();
		user.register(theLibrary);
		String output = user.getLibrary();
		String expected = "Croydon Library";
		assertEquals(expected, output);
	}
}

























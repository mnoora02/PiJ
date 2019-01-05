package Day_13;

import org.junit.*;
import static org.junit.Assert.*;

public class LibraryTest {

	@Test
	public void getMaxBooksPerPerson() {
		Library theLibrary = new LibraryImpl();
		int output = theLibrary.getMaxBooksPerPerson();
		int expected = 3;
		assertEquals(expected, output);
	}

	@Test
	public void setMaxBooksPerPerson() {
		Library theLibrary = new LibraryImpl();
		theLibrary.setMaxBooksPerPerson(5);
		int output = theLibrary.getMaxBooksPerPerson();
		int expected = 5;				// diff't int to check against getMaxBooksPerPerson
		assertEquals(expected, output);
	}

} // END test class

package Day_13;

import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {

	@Test
	public void testGetAuthor(){
		Book book = new BookImpl("J.K.Rowling", "Harry Potter"); 
		String output = book.getAuthor();
		String expected = "J.K.Rowling";
		assertEquals(expected, output);
	}	

	@Test
	public void testGetTitle(){
		Book book = new BookImpl("J.K.Rowling", "Harry Potter"); 
		String output = book.getTitle();
		String expected = "Harry Potter";
		assertEquals(expected, output);
	}		

} // END of class





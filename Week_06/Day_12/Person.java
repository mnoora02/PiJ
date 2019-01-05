package Week_06.Day_12;

public class Person {

	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
		}
		return result;
	} // END of getInitials method

} // END of class



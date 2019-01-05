package Week_04.Updated_Day_08.Q7;

import java.util.Arrays;

public class StringExtensionMainApp {

	public static void main(String[] args) {
		String s = "";
		Class stringClass = s.getClass();
		System.out.println(Arrays.toString(stringClass.getDeclaredMethods()));
	}

}
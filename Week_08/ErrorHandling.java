package Week_08;/* 3 Error handling on user input
a)
Write a program that reads 10 numbers from the user and then prints the mean average. If the user inputs
something that is not a number, the program should complain and ask for a number again until 10 numbers have
been introduced.
b)
Modify the program so that it first asks how many numbers the user wants to enter, and then asks for the numbers.
The computer should complain if the user enters something that is not a number in both cases. Use methods to
prevent code repetitions.
*/ 

import java.util.List;
import java.util.ArrayList;

public class ErrorHandling {

	private List<Integer>;
	private ArrayList<Integer>;
	
	public static void main(String[] args) {
		ErrorHandling errorHandling = new ErrorHandling();
	}

	public void addNumberToList() {
		List<Integer> intList = new ArrayList<Integer>(10); 
		int newNum = System.in.read();
		intList.add(newNum);
	}

	public void runProgram() {
		try {
			System.out.println("Please input a number: ");
			int newNum = System.in.read(); 
			intList.add(newNum);
			// more code here
		} catch (NullPointerException ex) {
			ex.printStackTrace();
		}
	}
} // END of class
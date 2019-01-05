package Week_08;/*1 Code flow - Look at the following code and write the code flow (use the line numbers to indicate which lines are executed in
which order) in the following situations:

• userInput is 0.
• userInput is 2.
• userInput is 4.
• userInput is 6.

01 public void launch(int userInput) {
02 	List<Integer> intList = new ArrayList<Integer>();
03 	intList.add(1);
04 	intList.add(2);
05 	intList.add(3);
06 	intList.add(4);
07 	intList.add(5);
08 	intList.add(6);
09 	try {
10 		intList.remove(0);
11 		System.out.println(intList.get(userInput));
12 		intList.remove(0);
13 		System.out.println(intList.get(userInput));
14 		intList.remove(0);
15 		System.out.println(intList.get(userInput));
16 		intList.remove(0);
17 		System.out.println(intList.get(userInput));
18 		intList.remove(0);
19 		System.out.println(intList.get(userInput));
20 		intList.remove(0);
21 		System.out.println(intList.get(userInput));
22 		intList.remove(0);
23 		System.out.println(intList.get(userInput));
24 	} catch (IndexOutOfBoundsException ex) {
25 		ex.printStackTrace();
26 		}
27 }
Incorporate this code into a simple class to verify your answers.

*/

import java.util.List;
import java.util.ArrayList;

public class CodeFlow {	

	public void launch(int userInput) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		try {
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
			intList.remove(0);
			System.out.println(intList.get(userInput));
		} catch (IndexOutOfBoundsException ex) {
			ex.printStackTrace();
		}
	}
} // END of class






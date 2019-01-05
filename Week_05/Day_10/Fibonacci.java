package Week_05.Day_10;/*
NB: if you don't need private member fields DONT!
treat methods in the same way unless (for example) they become too large 
then break it up into multiple methds with perhaps one or two being private 
*/

public class Fibonacci {

	public int getFibo(int num) {
		if (num == 1) {
			return 1;
		}
		else {
			return (getFibo(num -1) + getFibo(num - 2));
		}
	}
	public static void main(String[] args) {
		Fibonacci myFib = new Fibonacci();  // create a new object otherwise running the program with PSVM without this will get a complaint - static context error
		System.out.println(myFib.getFibo(6));
	}	
}



1 - 1
2 - 3
3 - 7 - we know how 
4 - 7 + 7 + 1 = 15
5 - 15 + 15 + 1 = 31

public int findMoveCount(int discCount) {
	return 1 + 2 * findMoveCount
}

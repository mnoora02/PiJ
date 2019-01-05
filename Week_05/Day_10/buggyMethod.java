package Week_05.Day_10;
/* 
b)
Do you see anything wrong with the following code? How would you fix it?
*/ 

public class BuggyMethod {

	private int;
	private String buggyMethod;

	public static void main(String[] args){

	}

	String buggyMethod(Integer.parseInt n) {
		if (n == 0) {
			return "";
		}
		return n + " " + buggyMethod(n - 2);
	}
	
}


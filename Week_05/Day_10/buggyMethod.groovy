package Week_05.Day_10

/* 
b)
Do you see anything wrong with the following code? How would you fix it?
*/ 

public class BuggyMethod {

	private int;

	public static void main(String[] args){
		
	}


String buggyMethod(int n) {
	if (n == 0) {
		return "";
	}
	return n + " " + buggyMethod(n - 2);
}


}


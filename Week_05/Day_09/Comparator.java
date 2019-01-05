package Week_05.Day_09;// Day 9 1 Don’t Repeat Yourself - Look at the following code. Is there anything you can do to make this code better? Hint: you may need to convert
// between types (e.g. casting).

public class Comparator {

	public static void main(String[] args){
		Comparator c = new Comparator();
		System.out.println(c.getMax(3,4));
		System.out.println(c.getMax(4.2,1.2));
		System.out.println(c.getMax("10","20"));
	}

	public int getMax(int n, int m) {
		return (int) getMax((double)n,(double)m);
	}

	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}

	public String getMax(String number1, String number2) {
		double n1 = Double.parseDouble(number1);			// parse the String into Double (general type) and it'll handle floating points N: will turn 1 into 1.0
		double n2 = Double.parseDouble(number2);
		return String.valueOf(getMax(n1,n2));
	}
}
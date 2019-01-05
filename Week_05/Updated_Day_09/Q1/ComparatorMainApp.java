package Week_05.Updated_Day_09.Q1;

public class ComparatorMainApp {

	public static void main(String[] args) {
		Comparator compr = new Comparator();

		System.out.println(compr.getMax(3, 5));
		System.out.println(compr.getMax(45.9, 78.3));
		System.out.println(compr.getMax("5", "9"));
	}
}
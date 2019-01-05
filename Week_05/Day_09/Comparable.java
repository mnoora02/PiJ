package Week_05.Day_09;

public class Comparator <T extends Comparable<T>> {
	public static void main (String[] args){
		Comparator c = new Comparator();
		System.out.println(c.getMax(3, 3));
		System.out.println(c.getMax(3.1, 4.1));
		System.out.println(c.getMax("10", "40"))
	}
	
	public T getMax(T n, T m) {
		return (n.compareTo(m) > 0 ? n : m);
	}
}
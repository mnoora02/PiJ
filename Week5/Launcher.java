public class Launcher {

  public static void main(String[] args) {
	Comparator myComparator = new Comparator();
	System.out.println(myComparator.getMax(1,2));
	System.out.println(myComparator.getMax(1.0,2.0));
	System.out.println(myComparator.getMax("1", "2"));
  }
}
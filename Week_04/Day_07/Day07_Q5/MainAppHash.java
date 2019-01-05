package Week_04.Day_07.Day07_Q5;

public class MainAppHash {

	public static void main(String[] args) {
		System.out.println("Give me a string and I'll calc. it hash code: ");
		String str = System.console().readLine();
		int hash = str.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
	}
}
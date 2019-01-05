package Week_05.Day_09;

public class Launcher {
	public static void public static void main(String[] args) {
		Stack stack = new StackImpl();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		while (!stack.isEmpty()){
			System.out.println(stack.pop);
		}
	}
}
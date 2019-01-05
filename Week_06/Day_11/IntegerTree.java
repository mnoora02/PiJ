package Week_06.Day_11;

public class IntegerTree {

	private IntegerTreeNode head = null;

	public IntegerTree(int num) {
		this.head = new IntegerTreeNode(num);
	}

	public void addNode(int num) {
		this.head.add(num);
	}

	public int getMax() {
		return this.head.getMax();
	}

	public int getMin() {
		return this.head.getMin();
	}

	public String toString() {
		return head.toString();
	}

	public String toStringSimplified() {
		return head.toStringSimplified();
	}

}
package Week_06.Day_11;

public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public IntegerTreeNode(int value) { // creating a constructor with parameter for the headNode
		this.value = value;
		this.left = null;
		this.right = null;
	}

	public int getMax() {		
		if (this.right == null) {
			return this.value;
		} else {
			return this.right.getMax();
		}
	}
	public int getMin() {		
		if (this.left == null) {
			return this.value;
		} else {
			return this.left.getMax();
		}
	}

	// ... methods would be here
	public void add(int newNumber) { // add value method
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int n) { // checks to see if a value you've entered is in the tree
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}

	public String toString() {
		String s = "[" + this.value + " L[";
		if (this.left != null) {
			s = s + this.left.toString();
		}
		s = s + "] R[";
		if (this.right != null) {
			s = s + this.right.toString();
		}
		s = s + "]";
		return s;
	}

	public String toStringSimplified() {
		String s = "[" + this.value + " [";
		if (this.left != null) {
			s = s + this.left.toStringSimplified();
		}
		s = s + "] [";
		if (this.right != null) {
			s = s + this.right.toStringSimplified();
		}
		s = s + "]";
		return s;
	}

} // END of class





















package Week_05.Day_09;

public class StackImpl implements Stack {

	private StackNode head = null; 

	public void push(Integer n) {
		StackNode head = new StackNode(newValue);
		if(isEmpty()) {
			head = newNode;
			return;
		}
		newNode.setNext(head);
		head = newNode;
	}

	public void pop() {
		if (isEmpty()) {
			return null;
		}
		Integer result = head.getValue();
		head = head.getNext();
		return result;
	}

	public isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}

}
package Week_05.Updated_Day_09.Q2;

public class GenericStack<N extends Number> {

	private NodeElement<N> firstNode = null;

	public void push(NodeElement<N> newNode) {
		if (firstNode == null) {
		firstNode = newNode; 
		}
		else {
			NodeElement<N> currentNode = firstNode;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
			newNode.setPrevNode(currentNode);
		}
	}

	public N pop() {
		if (firstNode == null) {
			throw new IndexOutOfBoundsException(); 
		}
		else if (size() == 1) {
			N output = firstNode.getElement();
			firstNode = firstNode.getNextNode(); 
			firstNode.setPrevNode(null);
			return output;
		}
		else {
			NodeElement<N> currentNode = firstNode;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			N output = currentNode.getElement();
			currentNode.getPrevNode().setNextNode(null);
			currentNode.setPrevNode(null);
			return output;
		}
	}

	public int size() {
		NodeElement<N> currentNode = firstNode; 
		int counter = 0;
		while (currentNode != null) {
			counter ++; 
			currentNode = currentNode.getNextNode(); 
		}
		return counter;
	}


} //END of class

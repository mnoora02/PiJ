package Week_05.Updated_Day_09.Q2;

public class GenericDouble<T> {
	
	// private Patient[] patientArray = new Patient[90];
	private NodeElement<T> firstNode = null;

	public void addNodeElement(NodeElement<T> newNode) {
		if (firstNode == null) {
		firstNode = newNode; 
		}
		else {
			NodeElement<T> currentNode = firstNode;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
			newNode.setPrevNode(currentNode);
		}
	}
	
	public boolean deleteNode(T element) {
		if (firstNode == null) {
			return false; 
		}
		else if (firstNode.getElement().equals(element)) {
			firstNode = firstNode.getNextNode(); 
			firstNode.setPrevNode(null);
			return true;
		}
		else {
			NodeElement<T> currentNode = firstNode;
			while (currentNode.getNextNode() != null) {
				if (currentNode.getNextNode().getElement().equals(element)) {
					currentNode.setNextNode(currentNode.getNextNode().getNextNode());
					currentNode.getNextNode().setPrevNode(currentNode);
					return true;
				}
				currentNode = currentNode.getNextNode();
			}
			return false;
		}
	}

	public void toPrint() {
		if (firstNode == null) {
			System.out.println("No elements in list!");
		}
		else {
			NodeElement<T> currentNode = firstNode;
			while (currentNode != null) {
				System.out.println(currentNode);
				currentNode = currentNode.getNextNode();
			}
		}
	}

	public void printBackwards() {
		if (firstNode == null) {
			System.out.println("No elements in list!");
		}
		else {
			NodeElement<T> currentNode = firstNode;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			while (currentNode != null) {
				System.out.println(currentNode);
				currentNode = currentNode.getPrevNode();
			}
		}
	}

	public int lengthList() {
		NodeElement<T> currentNode = firstNode; 
		int counter = 0;
		while (currentNode != null) {
			counter ++; 
			currentNode = currentNode.getNextNode(); 
		}
		return counter;
	}
} // END of class

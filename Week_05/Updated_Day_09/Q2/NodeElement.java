package Week_05.Updated_Day_09.Q2;


public class NodeElement<T> {
	private T element;
	private NodeElement<T> prevNodeElement;	
	private NodeElement<T> nextNodeElement;	

	public NodeElement(T element) {
		this.element = element;
		this.prevNodeElement = null;
		this.nextNodeElement = null;
	}							

	public NodeElement<T> getNextNode() {
		return this.nextNodeElement;
	}

	public void setNextNode(NodeElement<T> nextNode) {		
		this.nextNodeElement = nextNode;
	}

	public NodeElement<T> getPrevNode() {
		return this.prevNodeElement;
	}

	public void setPrevNode(NodeElement<T> prevNode) {		
		this.prevNodeElement = prevNode;
	}

	public T getElement() {
		return this.element; 
	}
} //END of class

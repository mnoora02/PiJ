package Week_06.Day_11;

public class TestTree {
	public static void main(String[] args) {
		 IntegerTree myTree = new IntegerTree(7);
		 int[] numbers = new int[]{1,23,45,6,7,56,2,89,12};
		 for(int num:numbers) {
		 	System.out.println(num);
		 	myTree.addNode(num);
		 }
		
		System.out.println("The max num in the tree is : " + myTree.getMax());
		System.out.println();
		System.out.println("The min num in the tree is : " + myTree.getMin());
		System.out.println(myTree.toString());
		System.out.println();
		System.out.println(myTree.toStringSimplified());
	}
}
package Day_18.Day_19;

import java.util.List;
import java.util.ArrayList;

public class AppleLauncherII {

	public static void main(String[] args) {
		AppleLauncherII aL = new AppleLauncherII();
		List<Apple> appleList = new ArrayList<>();
		appleList.add(new Apple (6, "Green"));
		appleList.add(new Apple (4, "Green"));
		appleList.add(new Apple (2, "Red"));
		appleList.add(new Apple (7, "Black"));
		appleList.add(new Apple (10, "Purple"));
	}

	public List<Apple> greenAppleList(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>(); 

		for(Apple apple : inventory) {
			if (apple.getColour.equals("Green")) {					// if ("Green".equals()apple.getColour())){
				System.out.println("Weight: " + apple.getWeight);
				result.add(inventory[apple]);
			}
		}
		return result;
	}

	public List<Apple> filterAppleByColour(List<Apple> inventory, String colour) {
		List<Apple> result = new ArrayList<>(); 
		for(Apple apple : inventory) {
			if (apple.getColour.equals(colour)) {					// if ("Green".equals()apple.getColour())){
				result.add(inventory[apple]);
			}
		}
		return result;
	}
}
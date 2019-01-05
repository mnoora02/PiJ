package Week_05.Updated_Day_09.Q2;

import java.util.List;
import java.util.ArrayList;

public class MobilePhone extends OldPhone {

	private List<String> lastNumbersDialled;



	public MobilePhone(String brand) {						// constructor method in q3 takes a PARAM with its return type 
		super(brand);										// calling constructor from super class
		this.lastNumbersDialled = new ArrayList<String>();
	}

	public void ringAlarm(String alarm) {
		System.out.println("ringing: " + alarm);
	}


	public void playGame(String birds) {
		System.out.println("Playing: " + birds);
	}

	public void printLastNumbers() {
		// System.out.println(this.lastNumbersDialled);
		for (String s : lastNumbersDialled) {			// for (int i = 0; i < lastNumbersDialled.size(); i++) {
			System.out.println(s);						//		System.out.println(lastNumbersDialled.get(i));
		}
		// lastNumbersDialled.forEach(s -> System.out.println(s)); // lambda expression
		// lastNumbersDialled.forEach(System.out::println);		// anonymous expression
	}

	@Override
	public void call(String number) {
		super.call(number);
		this.lastNumbersDialled.add(0, number);
		if (lastNumbersDialled.size() > 10) {
			lastNumbersDialled.remove(10);
		}
	}

} // 
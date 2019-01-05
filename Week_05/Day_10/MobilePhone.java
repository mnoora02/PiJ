package Week_05.Day_10;

class MobilePhone extends OldPhone {

	private String[] recentCalls; // stores recent calls in an array

	public void ringAlarm(String ringing) {
		System.out.println("ringing...");
	}
	//public void playGame(String playing) {
	//	System.out.println("playing...");
	//}
//	public void printLastNumbers(String recentCalls) {
//		System.out.println("last numbers: " + recentcalls);
//	}

	@Override
	public void call(String number) {
		super.call(number);		//calling old method using super
		recentCallHistory(number);  // create a new method to store the called numbers  
	}

	public void recentCallHistory(String currentNumber) {
		if (recentCalls == null) {
			recentCalls = new String[10];  //NB: use new to instantiate/create the object and place on heap 
		}
		for (int i = 9; i > 0; i--) {
			if (recentCalls[i] == null) {
				recentCalls[i] = currentNumber;
				break;
			}
			else {
				recentCalls[i-1] = currentNumber;
			}
		}
	}

	public void printCallHistory() {
		for (int i = 0; i<=9; i++) {
			if (recentCalls == null) {
				System.out.println("No numbers stored: ");
			}
			else {
				System.out.println("Call history is: " + i + " " + this.recentCalls[i]); //print i (index position) followed by the private member field with its value in a given index position
			}
		}
		System.out.println(recentCalls);
	}

}
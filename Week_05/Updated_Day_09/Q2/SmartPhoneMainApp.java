package Week_05.Updated_Day_09.Q2;

public class SmartPhoneMainApp {

	public static void main(String[] args) {
		SmartPhone smartP = new SmartPhone("VodaPhone");
		// MobilePhone smartP = new SmartPhone("VodaPhone");

		smartP.ringAlarm("woohoo!");
		smartP.playGame("BattleShips");
		smartP.printLastNumbers();
		smartP.call("0208-123-4567");
		smartP.browseWeb("Google.com");
		smartP.findPosition();

		MobilePhone mobile = new MobilePhone("Nokia");

		testPhone(mobile);							// NB: 
	}

	public static void testPhone(Phone phone) {		// NB: remember static - can only act on static or create a launch method 
		SmartPhone downCastPhone = (SmartPhone)phone; // NB: to downcast you place in () the name of obj. you want to downcast to, followed by the obj you want to downcast
		//phone.call("000-000-000");					
		//phone.ringAlarm("Awooga!");					// won't work because Phone.java is an interface with only a call() 
		//phone.browseWeb();
		downCastPhone.call("000-000-000");			// call method on the obj. 
		downCastPhone.ringAlarm("Awooga!");			// won't work because Phone.java is an interface with only a call() 
		downCastPhone.browseWeb("Googling...");
		downCastPhone.printLastNumbers();
		downCastPhone.findPosition();
	}


}


	
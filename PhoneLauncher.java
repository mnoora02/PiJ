

public class PhoneLauncher {
	public static void main (String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	public void launch() {

		/*SmartPhone moPhone = new SmartPhone();
		moPhone.browseWeb("excercise browse: www.google.com");
		moPhone.findPosition("3.14.15.926.535.8979.323");
		moPhone.ringAlarm("bring bring!");
		moPhone.playGame("Shoot 'em up..!");
		moPhone.call("0207-123-4567");
		moPhone.call("0207-145-8910");
		moPhone.call("0207-167-1112");
		moPhone.call("0207-189-1314");
		moPhone.call("0207-111-1516");
		moPhone.call("0207-112-1718");
		moPhone.call("0207-113-1920");
		moPhone.call("0207-114-2122");
		moPhone.call("0207-115-2324");
		moPhone.call("0207-116-2526");
		moPhone.printCallHistory();*/

		SmartPhone myphone = new SmartPhone();
		MobilePhone myMobilePhone = myphone;  //upcasting */

		myMobilePhone.call("123");
		myMobilePhone.playGame("PiJ game");

		/*MobilePhone myMobilePhone2 = new MobilePhone();
		SmartPhone myphone2 = myMobilePhone2; //downcasting*/

	}
}
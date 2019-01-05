package Week_05.Updated_Day_09.Q2;

public class PhoneLauncher {
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {

		SmartPhone smartphone = new SmartPhone("Apple");		// Q3 added a PARAM of return type String

		smartphone.browseWeb("Google"); 
		smartphone.findPosition();
		smartphone.ringAlarm("Bring Bring");
		smartphone.playGame("Cowboys & Indians!"); 
		smartphone.call("0207-777-7777");
		smartphone.call("0207-123-4567");
		smartphone.call("0207-763-9876");
		smartphone.call("0207-111-2222");
		smartphone.call("0207-123-3465");
		smartphone.call("0207-142-0971");
		smartphone.call("0207-245-9124");
		smartphone.call("0207-000-4567");
		smartphone.call("00-123-123-123");
		smartphone.call("0207-812-0915");
		smartphone.call("0207-345-8734");
		smartphone.call("0207-941-9820");
		smartphone.call("0207-127-3498");
		smartphone.printLastNumbers();
		System.out.println(smartphone.getBrand());
	}
}
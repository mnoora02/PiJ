package Week_04.Updated_Day_08.Q1_4;

public class SmartPhone extends MobilePhone {

	public SmartPhone(String brand) {
		super(brand);
	} 
	
	public void browseWeb(String browse) {
		System.out.println("Browsing: " + browse);
	}

	public void findPosition() {
		System.out.println("GPS is: 2344 1246 1234 N");
	}

	@Override
	public void call(String number) {
		super.call(number);
		if (number.substring(0, 2).equals("00")) {
			System.out.println(" through the internet to save money");
		}
	}

}
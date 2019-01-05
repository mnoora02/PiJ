package Week_05.Updated_Day_09.Q2;

public class RestrictedSmartPhone extends SmartPhone {

	public RestrictedSmartPhone(String brand) {
		super(brand);
	}

	@Override
	private void playGame(String birds) {
		System.out.println("Playing: " + birds);
	}
}
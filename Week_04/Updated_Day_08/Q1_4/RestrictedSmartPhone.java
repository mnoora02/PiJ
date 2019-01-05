package Week_04.Updated_Day_08.Q1_4;

public class RestrictedSmartPhone extends SmartPhone {

	public RestrictedSmartPhone(String brand) {
		super(brand);
	}

	@Override
	private void playGame(String birds) {
		System.out.println("Playing: " + birds);
	}
}
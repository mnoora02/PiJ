public class MobilePhone extends OldPhone {
	private String[] printLastNumbers;
	
	public void ringAlarm(String alarm) {
		System.out.println ("Ring ring ring!");
	}
	public void playGame(String game) {
		System.out.println ("Shoot 'em up!");
	}
	@Override
	public void call(String number) {
		super.call(number);
		printLastNumbers(number);
	}
	public void printLastNumbers(String number) {
		printLastNumbers = new String[10];
	}
}
package Week_04.Updated_Day_08.Q5;

public class Guitar implements MusicalInstrument, WoodenObject {

	@Override
	public void burn() {
		System.out.println("Burning object..");
	}

	@Override
	public void play() {
		System.out.println("Playing instrument..");
	}

}
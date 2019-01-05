package Week_04.Updated_Day_08.Q1_4;

public class OldPhone implements Phone {
	
	private String brand = null;

	public OldPhone(String brand) {			// constrcutor
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	// ... there is no setter for brand
	
	public void call(String number) {
		System.out.println("Calling " + number);
	}

}
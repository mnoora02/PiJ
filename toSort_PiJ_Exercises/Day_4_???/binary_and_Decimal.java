// creating a launcher class where you get input from user and run the program

public class binary_and_Decimal {
	public static void main(String[] args) {

	binary_and_Decimal bin2dec_ex = new binary_and_Decimal();	// create a new class of the binaryDecimal i.e. we're gonna create the actual obj of it as this is the blueprint
	
	println "enter a binary number to convert to decimal: " 
	String str = System.console().readLine();
	System.out.println(binary2Decimal(str)); 										// call method and feed str and print it out
	}
}


/*

	public int power(int b, int e) {  // for methods returning something, declare its type
		int result = 0;							//can declare a var and type 
		result = Math.pow(b,e);			// math.pow for exponents - NB: use comma
		return result;
	}  
	
	public int power2(int e) {
		int result = power(2, e);		// calling power above and using the one parameter from here
		return result;
	}
	
	public int binary2Decimal(String a) {
		int power_position = a.length()-1;		//calc. length of string and get power pos.
		int result = 0;
		for (int i = 0, i < a.length(), i++){	// int i, whilst i is less than length
			if (a.charAt(i) == 1) {				//if charAt position is a positive integer do...
				int result = result + power2(power_position); //power2 needs one param. 
				power_position = power_position -1;
			} else {
				power_position = power_position -1; //bring power_position down if there is a 0
			}
		}   			
		return result;
	}
	
	decimal2binary(int decimal) {
		while (decimal >		int binary_num = decimal % 2;
		String binary = binary_num		// converting our binary into string
		decimal = decimal / 2
 0){
			int binary_num = decimal % 2;
			String binary = Integer.toString(binary_num) + binary	// converting our binary into string and adding in front of string/row
			decimal = decimal / 2			
		}
		return binary;
	}		
	*/
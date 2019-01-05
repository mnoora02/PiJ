// oldphone launcher class

import Week_04.Updated_Day_08.Q1_4.MobilePhone;

public class PhoneLauncher {
	public static void main(String[] args) {
		System.out.println("Question 1");
		OldPhone op1 = new OldPhone();	
		op1.call("999");
		MobilePhone mp1 = new MobilePhone();
		mp1.call("112");
		mp1.playGame("Shoot 'em up!");
	}   
}
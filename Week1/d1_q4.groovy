/*
Day 1 - Q4 Prime numbers
Write a program that asks a number from the user, then says whether the number is prime or not. Remember that
a prime number is a number that is divisible only by 1 and itself. You can use the modulo operator (if a % b is
zero, then a is divisible by b).
*/



String str = ""
boolean prime = true

if (str != "exit") {
	println "Enter number or type 'exit' to quite: "
	str = System.console()readLine()
	int num = Integer.parseInt(str)
	for (i = 2; i < num; i++) {
		if (num % i == 0) {
			prime = false
			println "number is NOT prime"
			break
		} else {
			println "number IS prime"
		}
	}
}

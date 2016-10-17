
Day3 question 2 Calculator
Write a program that reads two numbers from the user and then offers a menu with the four basic operations:
addition, subtraction, multiplication, and division. Once the user has selected an operation from the menu, the
calculator performs the operation.
Hint: In the same way that there exists an Integer.parseInt() method to parse integers, there is a Double.parseDouble()
method to parse real numbers.
*/


println "Enter your first number: "
String str1 = System.console().readLine(); 
double firstNum = Double.parseDouble(str1);


println "Enter your second number: "
String str2 = System.console().readLine(); 
double secNum = Double.parseDouble(str2);


println "Choose an operator + - x /" 
String str = System.console().readLine()
if (str == "+") {
	println (Math.abs(firstNum + secNum))
} else if (str == "-") {
	println (Math.abs(firstNum - secNum))	
} else if (str == "x") {
	println (Math.abs(firstNum * secNum))
} else if (str == "/") {
	println (Math.abs(firstNum / secNum))
}
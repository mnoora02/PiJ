
/*
Day 3 question 3 Command-line calculator (*)
Write a program that reads a text representing a mathematical operation (one of the four basic ones) with two
operands, and then execute it. For example, if the user enters “3/5” the program outputs “0.6”; if the user
enters “23 * 4” the program outputs “92”.

String str1 = System.console().readLine(); 
double firstNum = Double.parseDouble(str1);
println "Enter your second number: "
String str2 = System.console().readLine
double secNum = Double.parseDoublestr2
String str = System.console().readLine()
if (str == "+") 
	println Math.abs firstNum + secNum

*/


println args
println args[0]
println args[1]
println args[2]
double firstNum = Double.parseDouble(args[0])
double secNum = Double.parseDouble(args[2])
if (args[1] == "+") {
	println (firstNum + secNum)
} 

else if (args[1] == "-") {
	println (firstNum - secNum)
} else if (args[1] == "x") {
	println (firstNum * secNum)
} else if (args[1] == "/") {
	println (firstNum / secNum)
}
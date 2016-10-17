/*
Day 3 Q5 
Write a program that reads the X and Y coordinates of two points and then outputs the area of a rectangle where
both points are opposite corners. Use the following class to store the data for the points:
class Rectangle {
Point upLeft;
Point downRight;
}
Your program should calculate (and write on the screen) the perimeter and area of the rectangle.
Note: For exercises 5, 6, and 7 you must access (i.e. read or write) the value of the coordinates of the points
through the rectangle, not directly through the point, i.e. myRectangle.upLeft.x, not point.x or x.
*/



class Rectangle {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}


println "Where is the top of the rectangle?"
String str
str = System.console().readLine(); 
double top = Double.parseDouble(str);

println "Where is the bottom of the rectangle?"
String str
str = System.console().readLine(); 
double bottom = Double.parseDouble(str); 

println "Where is the left of the rectangle?"
String str
str = System.console().readLine(); 
double left = Double.parseDouble(str);

println "Where is the right of the rectangle?"
String str
str = System.console().readLine(); 
double right = Double.parseDouble(str);

// Main logic - we need to create the points and N2K where they are 
// Create the points
Point upLeft = new Point();
upLeft.x = left;
upLeft.y = top; 

Point downRight = new Point();
downRight.x = right;
downRight.y = bottom; 

//Create the rectangle 
Rectangle myRectangle = new Rectangle()
myRectangle.upLeft = upLeft
myRectangle.downRight = downRight

//Calculate perimeter 
double height = myRectangle.upleft.y - myRectangle.downRight.y
double breadth = myRectangle.downRight.x - myRectangle.upLeft.x
double are = height * breadth 

perimeter = 2 * height + 2 * breadth

// Print result on screen 

println "The area is: " + area
println "The perimeter is: " + perimeter



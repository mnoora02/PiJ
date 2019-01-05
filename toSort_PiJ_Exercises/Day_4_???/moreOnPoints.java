/*
5 More on points
Write a program in which you create and use a class called Point

with two fields of type double (e.g. x, y) 

and the following methods:

distanceTo(Point): calculates the distance to another point.

distanceToOrigin(): calculates the distance to the origin. Implement it by calling the first method.

moveTo(double x, double y): changes the coordinates of this point to be the given parameters x and y.

moveTo(Point): changes the coordinates of this point to move where the given point is.

clone(): returns a copy of the current point with the same coordinates.

opposite(): returns a copy of the current point with the coordinates multiplied by −1.

Two methods in a class can have the same name (identifier) as long as their parameters are different. This is
called method overloading and we will see more of that in the future
*/

public class Point {
	private double x;
	private double y;
	
	public void Point morePoint1 = newPoint() {	// create an object of type Point and initialise x & y 
		x = 2;
		y = 6;
	}
	
	public void Point morePoint2 = new Point() {
		x = 5;
		y = 6; 
	}
	
	public double distanceTo(Point firstPoint, Point secondPoint) { // Method takes 2 points, then calculates the distance to another point returns the double i.e. square root of((x1-x2 squared) + (y1-y2 squared))
		return morePoint1.distanceTo(morePoint2);
	}
		
	publiC double distanceToOrigin(Point firstPoint, Point secondPoint) { // Same as above BUT one difference - NO NEED to square root ((x1-x2 squared) + (y1-y2 squared))
		return morePoint2.distanceTo(morePoint1);
	}
	
	public double moveTo(double x, double y) { // changes the coordinates of this point to be the given parameters x and y.  
		this.x = x;
		this.y = y;
	}
	public double moveTo(Point movedPoint) { // changes the coordinates of this point to move where the given point is.   moves your original point to a second location via the point as a whole
	
		this.point = movedPoint;
  }
	
	public clone();
	Point p2 = p.clone()
	
	public double opposite(Point oppositePoint) {  // returns a copy of the current point with the coordinates multiplied by −1.
		oppositePoint.setX(x*-1);
		oppositePoint.setY(y*-1);
		return oppositePoint;
	}
}
	

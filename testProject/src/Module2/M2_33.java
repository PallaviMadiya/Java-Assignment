/*33)	We have to calculate the area of a rectangle, a square and a circle. Create an 
 abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two 
 parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 
 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 
 'CircleArea' is its radius. Now create another class 'Area' containing all the three 
 methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle,
 square and circle respectively. Create an object of class 'Area' and call all the three 
 methods. */

package Module2;

abstract class Shape{
	abstract public double RectangleArea(double length, double breadth);
	abstract public double SquareArea(double side);
	abstract public double CircleArea(double radius);
}

class AreaOfShape extends Shape{
	private double pi = 3.14;
	@Override
	public double RectangleArea(double length, double breadth) {
		return length * breadth;
	}

	@Override
	public double SquareArea(double side) {
		return 4*side;
	}

	@Override
	public double CircleArea(double radius) {
		return pi * radius * radius;
	}
}

public class M2_33 {
	public static void main(String[] args) {
		AreaOfShape A = new AreaOfShape();
		System.out.println("Area Of Rectangle: "+A.RectangleArea(5, 4));
		System.out.println("Area Of Square: "+A.SquareArea(5));
		System.out.println("Area Of Circle: "+A.CircleArea(7));
	}
}

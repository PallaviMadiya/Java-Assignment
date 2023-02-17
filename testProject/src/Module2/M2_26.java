/*26) Create a class named 'Rectangle' with two data members 'length' and 'breadth' 
 and two methods to print the area and perimeter  of the rectangle respectively. 
 Its constructor having parameters for length and breadth is used to initialize the \
 length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' 
 class with its constructor having a parameter for its side (suppose s) calling the 
 constructor of its parent class as 'super (s, s)'. Print the area and perimeter  of a 
 rectangle and a square. */

package Module2;

class Rectangle{
	private float length, breadth;
	Rectangle(float length,float breadth){
		this.length = length;
		this.breadth = breadth;
		System.out.println("Length: "+length+"\nBreadth: "+breadth);

	}
	public void areaMethod() {
		System.out.println("Area Of Rectangle: "+length * breadth);
	}
	public void perimeterMethod() {
		System.out.println("Perimeter Of Rectangle: "+2*(length + breadth));
	}
	
}
class Square extends Rectangle{

	private float side;
	public Square(float side){
		super(side=10, side=10);
		this.side = side;
		System.out.println("Side: "+side);
	}
	public void areaMethod() {
		super.areaMethod();
		System.out.println("Area Of Square: "+side*side);	
	}
	public void perimeterMethod() {
		super.perimeterMethod();
		System.out.println("Perimeter Of Square: "+4*side);
	}
}

public class M2_26 {
	public static void main(String[] args) {
		Square S = new Square(10);
		S.areaMethod();
		S.perimeterMethod();
	}
}

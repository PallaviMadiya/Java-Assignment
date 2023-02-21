/*35)	Create a class named 'Shape' with a method to print "This is this is shape". 
 Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, 
 both having a method to print "This is rectangular shape" and "This is circular shape" 
 respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square 
 is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 
 'Square' class. */
package Module2;

class ShapeCls{
	public void display() {
		System.out.println("This is Shape Class.");
	}
}
class RectangleCls extends ShapeCls{
	public void display() {
		super.display();
		System.out.println("This is rectangular shape.");
	}
}
class CircleCls extends ShapeCls{
	public void display() {
		System.out.println("This is circular shape.");
	}
}
class SquareCls extends RectangleCls{
	public void display() {
		super.display();
		System.out.println("Square is a rectangle.");
	}
}

public class M2_35 {
	public static void main(String[] args) {
		SquareCls S = new SquareCls();
		S.display();
	}
}

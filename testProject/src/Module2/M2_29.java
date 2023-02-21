/*29)	Create an abstract class 'Parent' with a method 'message'. It has two subclasses 
 each having a method with the same name 'message' that prints "This is first subclass" and
 "This is second subclass" respectively. Call the methods 'message' by creating an object for each 
 subclass. */

package Module2;

abstract class ParentClass{
	public void message() {

	}
}

class ChildOne extends Parent{
	public void message() {
		System.out.println("This is first subclass.");
	}
}

class ChildTwo extends Parent{
	public void message() {
		System.out.println("This is second subclass.");
	}
}

public class M2_29 {
	public static void main(String[] args) {
		ChildOne C1 = new ChildOne();
		ChildTwo C2 = new ChildTwo();
		
		C1.message();
		C2.message();
	}
}

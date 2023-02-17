/*24) Create a class with a method that prints "This is a parent class" and its 
 subclass with another method that prints "This is child class". Now, create an 
 object for each of the class and call 1 - method of parent class by object of parent 
 class 2 - method of child class by object of child class 3 - method of parent class 
 by object of child class */

package Module2;

class Parent{
	public void parentMethod() {
		System.out.println("This is Parent Class");
	}
}

class Child extends Parent{
	public void childMethod() {
		System.out.println("This is Child Class");
	}
}

public class M2_24 {
	public static void main(String[] args) {
		Parent P = new Parent();
		Child C = new Child();
		P.parentMethod();
		C.childMethod();
		C.parentMethod();
	}
}

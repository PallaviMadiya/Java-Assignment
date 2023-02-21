/*31)	We have to calculate the percentage of marks obtained in three subjects 
 (each out of 100) by student A and in four subjects (each out of 100) by student B. 
 Create an abstract class 'Marks' with an abstract method 'getPercentage'. 
 It is inherited by two other classes 'A' and 'B' each having a method with the same 
 name which returns the percentage of the students. The constructor of student A takes 
 the marks in three subjects as its parameters and the marks in four subjects as its 
 parameters for student B. Create an object for each of the two classes and print the 
 percentage of marks for both the students. */

package Module2;

abstract class Marks{
	abstract float getPercentage();
}

class A extends Marks{
	private float c, java, python;
	private float percentage;
	
	A(int c, int java, int python){
		this.c = c;
		this.java = java;
		this.python = python;
		System.out.println("Student A Marks: \nC: "+c+"\nJava: "+java+"\nPython: "+python);
	}
	public float getPercentage() {
		percentage = (c + java + python) * 100 / 300;
		return percentage;
	}
}

class B extends Marks{
	private int php, perl, css, java;
	private float percentage;
	
	B(int php, int perl, int css, int java){
		this.php = php;
		this.perl = perl;
		this.css = css;
		this.java = java;
		System.out.println("\nStudent B Marks: \nPHP: "+php+"\nPerl: "+perl+"\nCSS: "+css+"\nJava: "+java);
	}
	public float getPercentage() {
		percentage = (php + perl + css + java) * 100 / 400;
		return percentage;
	}
}

public class M2_31 {
	public static void main(String[] args) {
		A a = new A(63, 75, 56);
		B b = new B(75, 69, 80, 72);
	
		System.out.println("\nStudent A Percentage: "+a.getPercentage());
		System.out.println("Student B Percentage: "+b.getPercentage());
	}
}

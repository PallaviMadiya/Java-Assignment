/*43)	W.A.J.P to create a class Student with attributes roll no, name, age and course. 
 Initialize values through parameterized constructor. If age of student is not in between 
 15 and 21 then generate user defined exception "AgeNotWithinRangeException". If name 
 contains numbers or special symbols raise exception "NameNotValidException". 
 Define the two exception classes. */

package Module2;
import java.util.Scanner;

class AgeNotWithinRangeException extends Exception{
	public String toString() {
		return ("student age is not in between 15 and 21!");

	}
}
class NameNotValidException extends Exception{
	public String toString() {
		return ("Name is not valid!");
	}
}

class Student{
	private int roll_no, age;
	private String name, course;
	
	Student(int roll_no, int age, String name, String course){
		this.roll_no = roll_no;
		this.age = age;
		this.name = name;
		this.course = course;
	}
	public void validate() {
		try {
			if(!(age >= 15 && age <= 21)) {
				throw new AgeNotWithinRangeException();
			}
		}
		catch(AgeNotWithinRangeException e) {
			System.out.println(e);
		}		
		try {
			char[] nameArr = name.toCharArray();
			for(int i = 0; i < nameArr.length; i++) {
				if(!(Character.isAlphabetic(nameArr[i]))) {
					throw new NameNotValidException();
				}
			}
		}	
		catch(NameNotValidException e) {
			System.out.println(e);
		}
	}
}

public class M2_43 {
	public static void main(String[] args) {
		int roll_no, age;
		String name, course;
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Enter Student Details-------;\n");
		System.out.print("Enter Student Roll No: ");
		roll_no = sc.nextInt();
		
		System.out.print("Enter Student Name: ");
		name = sc.next();

		System.out.print("Enter Student Age: ");
		age = sc.nextInt();
		
		System.out.print("Enter Student Course: ");
		course = sc.next();
		
		Student S = new Student(roll_no, age, name, course);
		S.validate();
		sc.close();
	}
}

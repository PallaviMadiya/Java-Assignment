/*41)	W.A.J.P to create the validate method that takes integer value as a parameter. 
 If the age is less than 18, then throw an Arithmetic Exception otherwise print a message 
 welcome to vote. 
O/P- Enter your age: 16 
Exception in thread main java. Lang. Arithmetic Exception: not valid 
*/

package Module2;
import java.util.Scanner;

public class M2_41 {
	int validate(int age) {
		try {
			if(age < 18) {
				throw new ArithmeticException("Not eligible for vote.");
			}
			else {
				System.out.println("Welcome To Vote!");
			}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		return 0;
	}
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		age = sc.nextInt();
		
		M2_41 obj = new M2_41();
		obj.validate(age);
		sc.close();
	}	
}

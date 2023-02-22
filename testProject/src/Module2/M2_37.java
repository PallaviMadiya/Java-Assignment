/*37)	Take two numbers from the user and perform the division operation and handle 
 Arithmetic Exception. O/P- Enter two numbers: 10 0 Exception in thread main 
 java.lang.ArithmeticException:/ by zero.*/

package Module2;
import java.util.*;


public class M2_37 {
	public static void main(String[] args) {
		int dividend, divisor, quotient;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter dividend: ");
			dividend = sc.nextInt();
			System.out.print("Enter divisior: ");
			divisor = sc.nextInt();
			quotient = dividend / divisor;
			System.out.println("Division Of "+dividend+" By "+divisor+" is "+quotient);
			sc.close();
		}
		catch(ArithmeticException e) {
			System.out.println("Division By Zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Invalid Input Type! Enter Integer Value Only.");
		}
		catch(Exception e) {
			System.out.println("Some Error Occured!");
		
		}
	}
}

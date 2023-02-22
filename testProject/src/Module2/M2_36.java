/*36) W.A.J. P to demonstrate try catch block, */

package Module2;
import java.util.*;

public class M2_36 {
	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter a number: ");
			num1 = sc.nextInt();
			System.out.println("Number Is: "+num1);
		}
		catch(InputMismatchException e) {
			System.out.println("Enter an integer value!");
		}
		sc.close();
	}
}

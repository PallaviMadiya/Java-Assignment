/*40)	W.A.J. P to demonstrate try catch block, take two numbers from the user by Command 
 line argument and perform the division operation and handle Arithmetic O/PException in 
 thread main java. Lang. Arithmetic Exception:/ by zero */

package Module2;

public class M2_40 {
	public static void main(String[] args) {
		String n1 = args[0];
		String n2 = args[1];
		
		try {
			int div = Integer.parseInt(n1) / Integer.parseInt(n2);
			System.out.println("Division Of "+n1+" by "+n2+" is "+div);
		}
		catch(ArithmeticException e) {
			System.out.println("Division by zero is not possible.");
		}
	}
}

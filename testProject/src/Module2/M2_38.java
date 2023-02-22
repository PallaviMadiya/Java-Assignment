/*38)	W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
 exception and another one is to handle ArrayIndexOutOfBoundException) 
 int a [] =new int [5]; a [5]=30/0; */

package Module2;
//import java.util.*;

public class M2_38 {
	public static void main(String[] args) {
		try {
			int[] a = new int[5];
			for(int i = 0; i <= a.length; i++) { //i = 0 will throw ArithmeticException, While i = 1 & i <= a.length will throw ArrayIndexOutOfBoundsException 
				a[i] = 10 / i;
				System.out.println("10 Divide By "+i+" is "+a[i]);
			}
		}
		catch(ArithmeticException e) {
			System.out.println("Division By Zero!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bound!");
		}
	}
}

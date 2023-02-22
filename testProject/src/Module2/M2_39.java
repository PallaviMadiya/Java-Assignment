/*38)	W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero 
 exception and another one is to handle ArrayIndexOutOfBoundException) 
 int a [] =new int [5]; a [5]=30/0; */
/*39)	W.A.J. P to implement the above program (pro.no-M2_38) using nesting of try-catch 
 block. try { try {//code} catch (Exception e) {//code} catch (Exception e) {//code} */

package Module2;

public class M2_39 {
	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			try {
				for(int i = 0; i < a.length; i++) {
					a[i] = 10 / i;
					System.out.println("10 Divide By "+i+" is "+a[i]);
				}
			}
			catch(ArithmeticException e) {
				System.out.println("Division By Zero Is Not Possible!");
			}
			
			for(int i = 1; i <= a.length; i++) {
				a[i] = 10 / i;
				System.out.println("10 Divide By "+i+" is "+a[i]);
			}			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is out of bounds.");
		}
	}
}

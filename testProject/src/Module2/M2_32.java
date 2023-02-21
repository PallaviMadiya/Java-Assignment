/*32)	Write a program to print the factorial of a number by defining a method named 
 'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*. 
 *(n-1) *n. E.g.- 4! = 1*2*3*4 = 24 3! = 3*2*1 = 6 2! = 2*1 = 2 Also, 1! = 1 0! = 0 */

package Module2;
import java.util.Scanner;

public class M2_32 {
	public static void main(String[] args) {
		int n;
		long fact = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to find it's factorial: ");
		n = sc.nextInt();
		
		for(int i = 1; i <=n ; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial OF "+n+" Is "+fact);
		sc.close();	
	}
}

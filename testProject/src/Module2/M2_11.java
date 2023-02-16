/*Write a Java program that accepts an integer (n) and computes the value of
n+nn+nnn. Input number: 5
5 + 55 + 555 */
package Module2;
import java.util.*;

public class M2_11 {
	public static void main(String[] args) {
		int n, sum = 0, mul = 1,k;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			sum += i;
		}
		sc.close();
	}
}






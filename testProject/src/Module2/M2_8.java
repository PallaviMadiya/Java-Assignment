/*Write a Java program that reads a positive integer and count the number of digits the
number.
Input an integer number less than ten billion: 125463
Number of digits in the number: 6 */

package Module2;
import java.util.*;

public class M2_8 {
	public static void main(String[] args) {
		int n,count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		System.out.print("Digits in Number: ");
		while(n != 0) {
			n = (n - (n % 10)) / 10;
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}

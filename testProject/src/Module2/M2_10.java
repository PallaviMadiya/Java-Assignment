/*• Write a Java program to print the ASCII value of a given character. */

package Module2;
import java.util.Scanner;

public class M2_10 {
	public static void main(String[] args) {
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Character To Know Its ASCII Value: ");
		c = sc.next().charAt(0);		
		int ascii = (int) c;
		
		System.out.println(String.format("ASCII Valur Of '%s' is: %d",c,ascii));
		sc.close();
	}
}


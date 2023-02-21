/*16)	W.A.J.P to compare a given string to the specified character 
 sequence. Comparing topsint.com and topsint.com: true Comparing 
 Topsint.com and topsint.com: false */

package Module2;
import java.util.Scanner;

public class M2_16 {
	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
		str1 = sc.next();
		System.out.print("Enter Second String: ");
		str2 = sc.next();
		
		System.out.println(str1.equals(str2));
		sc.close();
	}
}

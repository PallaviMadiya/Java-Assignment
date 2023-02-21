/*15)	W.A.J.P to concatenate a given string to the end of another string.*/ 

package Module2;
import java.util.Scanner;

public class M2_15 {
	public static void main(String[] args) {
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter First String: ");
		str1 = sc.next();
		System.out.print("\nEnter Second String: ");
		str2 = sc.next();
		
		System.out.print("\nConcatinatio Of String First & Second: "+str1.concat(str2));
		sc.close();
	}
}

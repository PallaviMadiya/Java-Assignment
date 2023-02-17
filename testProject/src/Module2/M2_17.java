/*17)	W.A.J.P to check whether a given string ends with the contents of 
 another string. "Java Exercises" ends with "se"? False "Java Exercise" 
 ends with "se"? True */

package Module2;
import java.util.Scanner;

public class M2_17 {
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		str = sc.nextLine();
		System.out.println("'"+str+"' Ends with 'se'?\nOutput: "+str.endsWith("se"));
		sc.close();
	}
}

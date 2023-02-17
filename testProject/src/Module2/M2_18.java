/*18)	W.A.J.P to check whether a given string starts with the contents of another
  string. Red is favourite colour. Starts with Red? True Orange is also my favourite 
  colour. Starts with Red? False */

package Module2;
import java.util.Scanner;

public class M2_18 {
	public static void main(String[] args) {
		String compWith, str;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		str = sc.nextLine();
		System.out.print("Starts With: ");
		compWith = sc.nextLine();
		System.out.println(str.startsWith(compWith));
		sc.close();
	}	
}

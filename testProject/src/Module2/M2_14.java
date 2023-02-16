/*14) W.A.J.P to get the character at the given index within the String. 
Original String = Tops Technologies! The character at position 0 is T, 
The character at position 10 is o */

package Module2;
import java.util.*;

public class M2_14 {
	public static void main(String[] args) {
		String str = "Tops Technologies!";
		int index;
		Scanner sc = new Scanner(System.in);
		System.out.println("Original String: "+str);
		System.out.print("Enter Index:");
		index = sc.nextInt();
		System.out.println("The Character At Position "+index+" Is "+str.charAt(index));
		sc.close();
	}
}

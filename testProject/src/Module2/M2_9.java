/*Write a Java program to count the letters, spaces, numbers and other characters of
an input string.*/

package Module2;
import java.util.*;

public class M2_9 {
	public static void main(String[] args) {
		int digitCount = 0, ltrCount = 0, spsCount = 0, othCount = 0;
		String str;
		char sps = ' ';
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		
		str = sc.nextLine();
		char[] strArr = new char[str.length()];  

		strArr = str.toCharArray();
		for(int i = 0; i < strArr.length; i++) {
			if(Character.isDigit(strArr[i])){
				digitCount++;
			}
			else if(Character.isAlphabetic(strArr[i])) {
				ltrCount++;
			}
			else if(strArr[i] == sps) {
				spsCount++;
			}
			else {
				othCount++;
			}
		}
		System.out.println("\nString: "+str);
		System.out.println("String Length: "+str.length());
		System.out.println("\nLetters In String: "+ltrCount);
		System.out.println("Digit In String: "+digitCount);
		System.out.println("Spaces In String: "+spsCount);
		System.out.println("Other Characters In Sring: "+othCount);
		sc.close();
	}
}

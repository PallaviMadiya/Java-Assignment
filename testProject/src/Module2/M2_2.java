/*Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel or Consonant, depending on the user input. If the user input
is not a letter (between a and z or A and Z), or is a string of length > 1, print an error
message.*/
package Module2;
import java.util.*;

class M2_2{
	public static void main(String[] args){
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a alphabet: ");
		s = sc.next().toLowerCase();
		
		boolean uppercase = s.charAt(0)  >= 65 && s.charAt(0) <= 90;
		boolean lowercase = s.charAt(0) >= 97 && s.charAt(0) <= 122;
		boolean vowels = s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u");
		
		if(s.length() > 1) {
			System.out.println("Enter only single character!");
		}
		else if(!(uppercase || lowercase)) {
			System.out.println("Not a letter! Enter lowercase or uppercase letter.");
		}
		else if(vowels) {
			System.out.println("'"+s+"' is a vowel.");
		}
		else {
			System.out.println("'"+s+"' is a consonant.");
		}
		sc.close();
	}
}
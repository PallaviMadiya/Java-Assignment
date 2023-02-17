/*22)	Create a class to print an integer and a character with two methods having 
 the same name but different sequence of the integer and the character parameters. 
 For example, if the parameters of the first method are of the form (int n, char c), 
 that of the second method will be of the form (char c, int n). */
package Module2;

class intChar{
	public void intCharMethod(int n, char c) {
		System.out.println("Integer: "+n+" Character: "+c);
	}
	public void intCharMethod(char c, int n) {
		System.out.println("Character: "+c+" Integer: "+n);
	}
}

public class M2_22 {
	public static void main(String[] args) {
		intChar obj = new intChar();
		obj.intCharMethod(12, 'P');
		obj.intCharMethod('P', 21);
	}
}

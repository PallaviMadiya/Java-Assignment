/*19)	W.A.J.P to find all interleaving of given strings. The given strings are: 
 * WX YZ The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ */

package Module2;
//import java.util.Scanner;

public class M2_19 {
	public static void main(String[] args) {
		String str1 = "WX", str2 = "YZ", str;
		str = str1.concat(str2);
		char[] arr = str.toCharArray();
		System.out.println("The given strings are: "+str1+" "+str2);
		System.out.println(str.toCharArray());
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

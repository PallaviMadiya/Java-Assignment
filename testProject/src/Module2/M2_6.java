/*Write a program in Java to display the pattern like right angle triangle with a number.
1
12
123
1234
12345 */
package Module2;
import java.util.*;

class M2_6{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			for(int j = 0; j <= i;j++){
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
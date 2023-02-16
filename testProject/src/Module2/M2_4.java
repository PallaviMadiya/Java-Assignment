/*Write a program in Java to display the first 10 natural numbers
using while loop.*/
package Module2;
import java.util.*;

class M2_4{
	public static void main(String[] args){
		int n,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter A Number: ");
		n = sc.nextInt();
		System.out.print("Natural Numbers: ");

		while(i <= n){
			System.out.print(i+"  ");
			i++;
		}
		sc.close();
	}
}
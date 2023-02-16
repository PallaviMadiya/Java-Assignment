/*Write a program in Java to make such a pattern like right angle triangle with number
increased by 1 The pattern like:
1
2 3
4 5 6
7 8 9 10 */
package Module2;
import java.util.*;

class M2_7{
	public static void main(String[] args){
		int n,k=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = sc.nextInt();

		for(int i = 0; i < n; i++){
			for(int j = 0; j < i; j++){
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		sc.close();
	}
}
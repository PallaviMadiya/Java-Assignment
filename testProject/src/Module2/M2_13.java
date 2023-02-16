//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
//and by both.

package Module2;
import java.util.Scanner;

public class M2_13 {
	public static void main(String[] args) {
		boolean flag1 = false, flag2 = false;
		int[] arrayThree = new int[100];
//		int[] arrayFive = new int[50];
//		int[] arrayBoth = new int[50];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numbers Between 1 To 100 That Are Divisable By 3,5 & Both:");
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				flag1 = true;
					arrayThree[i] = i;
			}			
		}
		
		System.out.println("Value Divisable by 3: ");
		for(int j = 0; j < arrayThree.length; j++) {
			if(arrayThree[j] != 0) {
				System.out.println(arrayThree[j]);
			}
		}
		
		sc.close();
	}
}

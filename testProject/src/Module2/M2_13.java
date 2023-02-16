//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
//and by both.

package Module2;
import java.util.Scanner;

public class M2_13 {
	public static void main(String[] args) {
		int[] arrayThree = new int[100];
		int[] arrayBoth = new int[100];
		int[] arrayFive = new int[101];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numbers Between 1 To 100 That Are Divisable By 3,5 & Both:");
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0) {
				arrayThree[i] = i;
			}	
			
			if(i % 5 == 0) {
				arrayFive[i] = i;
			}
			
			if(i % 3 == 0 && i % 5 == 0) {
				arrayBoth[i] = i;
			}
		}
		
		System.out.println("\nValue Divisable by 3: ");
		for(int j = 0; j < arrayThree.length; j++) {
			if(arrayThree[j] != 0) {
				System.out.print(arrayThree[j]+"  ");
			}
		}
		
		System.out.println("\n\nValue Divisable by 5: ");
		for(int j = 0; j < arrayFive.length; j++) {
			if(arrayFive[j] != 0) {
				System.out.print(arrayFive[j]+"  ");
			}
		}
		
		System.out.println("\n\nValue Divisable by 3 && 5: ");
		for(int j = 0; j < arrayBoth.length; j++) {
			if(arrayBoth[j] != 0) {
				System.out.print(arrayBoth[j]+"  ");
			}
		}
		
		sc.close();
	}
}

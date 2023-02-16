//Write a Java program to Take three numbers from the user and print the greatest number. 
package Module2;

import java.util.*;


class M2_1 {
	public static void main(String[] args){
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		n1 = sc.nextInt();
		System.out.print("\nEnter Second Number: ");
		n2 = sc.nextInt();
		System.out.print("\nEnter Third Number: ");
		n3 = sc.nextInt();

		if(n1 > n2){
			if(n1 > n3){
				System.out.println(String.format("%d is greatest number.",n1));
			}
			else{
				System.out.println(String.format("%d is the greatest number.",n3));
			}
		}
		else{
			if(n2 > n3){
				System.out.println(String.format("%d is greatest number.",n2));
			}
			else{
				System.out.println(String.format("%d is greatest number.",n3));
			}
		}
		sc.close();
	}
}
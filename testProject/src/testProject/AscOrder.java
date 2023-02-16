package testProject;

import java.util.Scanner;

public class AscOrder {
	public static void main(String[] args) {
		int n,temp;
		System.out.print("Enter Length Of Array: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print(String.format("Enter %d Number:",i+1));
			array[i] = sc.nextInt();
		}
		
		System.out.println("Array Before Sorting: ");
		for(int i=0; i < n; i++) {
			System.out.print(array[i]+"  ");
			}
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("\nArray In Ascending Order: ");
		for(int i = 0; i < n; i++) {
			System.out.print(array[i]+"  ");
			}
		sc.close();
	}
}

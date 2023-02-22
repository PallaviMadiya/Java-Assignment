/*52)	Write a Java program to retrieve an element (at a specified index) from a given array list. */

package Module2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M2_52 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Tulip");
		list.add("Lotus");
		list.add("Lily");
		list.add("Iris");
		list.add("Snowdrop");
		list.add("Lilac");
		list.add("Buttercup");
		list.add("Larkspur");
		System.out.println(list);
		
		Scanner sc = new Scanner(System.in);
		int index;
		System.out.print("\nEnter an element posision you want to retrieve: ");
		index = sc.nextInt();
		
		System.out.println(list.get(index+1));
	}
}

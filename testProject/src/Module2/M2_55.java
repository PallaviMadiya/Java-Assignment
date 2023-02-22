/*55)	Write a Java program to search an element in an array list. */
package Module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class M2_55 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Lilac");
		list.add("Lily");
		list.add("Iris");
		list.add("Larkspur");
		list.add("Buttercup");
		list.add("Blossom");
		list.add("Calla");
		list.add("Periwinkle");
		
		System.out.println("\n------Flower Lisy------");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("\t"+itr.next());
		}
		Scanner sc = new Scanner(System.in);
		String ele;
		int pos;
		
		System.out.print("\nEnter which element you want to search: ");
		ele = sc.next();
		
		if(list.contains(ele)) {
			pos = ele.indexOf(ele);
			System.out.println("Found "+ele+" at position "+(pos+1));
		}
		else {
			System.out.println("Element Not Found!");
		}
		sc.close();
	}
}

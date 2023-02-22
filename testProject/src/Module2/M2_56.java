/*56)	Write a Java program to sort a given array list. */
package Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class M2_56 {
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
		System.out.println("List Before Sorting:");
		System.out.println("\n------Flower Lisy------");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("\t"+itr.next());
		}
		Collections.sort(list);
		System.out.println("\nList After Sorting:");
		System.out.println("\n------Flower Lisy------");
		Iterator<String> itr1 = list.iterator();
		while(itr1.hasNext()) {
			System.out.println("\t"+itr1.next());
		}
	}
}

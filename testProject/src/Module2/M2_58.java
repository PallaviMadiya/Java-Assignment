/*58)	Write a Java program to shuffle elements in an array list. */
package Module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class M2_58 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Lilac");
		list.add("Lily");
		list.add("Iris");
		list.add("Larkspur");

		System.out.println("\n------Flower Lisy------");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("\t"+itr.next());
		}
		System.out.println("\nShuffling Flower List");
		Collections.shuffle(list);
		System.out.println("\n------Flower Lisy------");
		Iterator<String> itr1 = list.iterator();
		while(itr1.hasNext()) {
			System.out.println("\t"+itr1.next());
		}
	}
}

/*53)	Write a Java program to update specific array element by given element. */

package Module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M2_53 {
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
		System.out.println("\nUpdate 'Lily' with 'SnowDrop'");
		list.set(1, "Snowdrop");

		System.out.println("\n------Flower Lisy------");
		Iterator<String> itr1 = list.iterator();
		while(itr1.hasNext()) {
			System.out.println("\t"+itr1.next());
		}
		
	}
}

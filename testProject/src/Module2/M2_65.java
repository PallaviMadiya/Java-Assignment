/*1)	Write a Java program to extract a portion of an array list. */

package Module2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M2_65 {
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
		
		System.out.println("\nPorsion Of List: ");
		System.out.println(list.subList(2, 5));
		
	}
}

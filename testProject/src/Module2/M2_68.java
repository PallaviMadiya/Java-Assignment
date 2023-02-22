/*68)	Write a Java program to join two array lists. */

package Module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M2_68 {
	public static void main(String[] args) {
		List listOne = new ArrayList();
		List listTwo = new ArrayList();
		
		listOne.add("Lilac");
		listOne.add("Lily");
		listOne.add("Iris");
		listOne.add("Larkspur");
		
		listTwo.add("Buttercup");
		listTwo.add("Blossom");
		listTwo.add("Calla");
		listTwo.add("Periwinkle");

		System.out.println("\n------Flower List One------");
		Iterator<String> itr1 = listOne.iterator();
		while(itr1.hasNext()) {
			System.out.println("\t"+itr1.next());
		}
		
		System.out.println("\n------Flower List Two------");
		Iterator<String> itr2 = listTwo.iterator();
		while(itr2.hasNext()) {
			System.out.println("\t"+itr2.next());
		}
		
		listOne.addAll(listTwo);
		System.out.println("\nJoin List One And List Two");
		System.out.println("\n------Flower List Two------");
		Iterator<String> itr3 = listOne.iterator();
		while(itr3.hasNext()) {
			System.out.println("\t"+itr3.next());
		}
	}
}

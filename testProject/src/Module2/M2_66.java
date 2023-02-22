/*66)	Write a Java program to compare two array lists. */

package Module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class M2_66 {
	public static void main(String[] args) {
		List listOne = new ArrayList();
		List listTwo = new ArrayList();
		
		listOne.add("Lilac");
		listOne.add("Lily");
		listOne.add("Iris");
		listOne.add("Larkspur");
		
//		listTwo.add("Lilac");
//		listTwo.add("Lily");
//		listTwo.add("Iris");
//		listTwo.add("Larkspur");
		
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
		
		System.out.println("\n------Comparison Of Two Lists------");
		System.out.println(listOne.equals(listTwo));
	}
}

/*67)	Write a Java program of swap two elements in an array list. */

package Module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class M2_67 {
	public static void main(String[] args) {
		List listOne = new ArrayList();
		listOne.add("Lilac");
		listOne.add("Lily");
		listOne.add("Iris");
		listOne.add("Larkspur");
		
		System.out.println("\n------Flower List One------");
		System.out.println(listOne);
				
		System.out.println("\nSwap 'Lili' with 'Iris' ");
		Collections.swap(listOne, 1, 2);
		
		System.out.println("\n------Flower List One------");
		System.out.println(listOne);
		
		
	}
}

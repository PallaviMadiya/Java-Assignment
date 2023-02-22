/*51) Write a Java program to insert an element into the array list at the first position. */

package Module2;

import java.util.ArrayList;
import java.util.List;

public class M2_51{
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Tulip");
		list.add("Lotus");
		list.add("Lily");
		list.add("Iris");
		list.add("Lilac");
		list.add("Aster");
		
		System.out.println(list);	

		System.out.println("\nAdding 'Buttercup' at first position.");
		list.add(0, "Buttercup");
		System.out.println(list);	
		
		System.out.println("\nAdding 'Larkspur' at first position.");
		list.add(0, "Larkspur");
		System.out.println(list);	
	}
}

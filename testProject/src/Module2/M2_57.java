/*57)	Write a Java program to copy one array list into another. */
package Module2;

import java.util.ArrayList;
import java.util.List;

public class M2_57 {
	public static void main(String[] args) {
		List<String> listOne = new ArrayList<String>();
		List<String> listTwo = new ArrayList<String>();

		listOne.add("Lilac");
		listOne.add("Lily");
		listOne.add("Iris");
		
		listTwo.add("Larkspur");
	
		System.out.println("\n------Flower List One------");
		System.out.println(listOne);
		System.out.println("\n\n------Flower List Two------");
		System.out.println(listTwo);
		
		System.out.println("\nCopying List One into List Two.");
		listTwo.addAll(listOne);
		System.out.println("\n------Flower List Two------");
		System.out.println(listTwo);
	}
}

/*64)	Write a Java program to reverse elements in an array list. */

package Module2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M2_64 {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Pal");
		list.add("Java");
		list.add(2023);
	
		System.out.println("List: "+list);
		Collections.reverse(list);
		System.out.println("Reverse List: "+list);
	}
}

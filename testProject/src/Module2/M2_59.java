/*59)	Write a Java program to append the specified element to the end of a hash set. */
package Module2;

import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class M2_59 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Pal");
		set.add("Java");
		set.add(2023);
		
		System.out.println("Set: "+set);
	}
}

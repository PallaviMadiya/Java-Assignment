/*60)	Write a Java program to iterate through all elements in a hash list. */
package Module2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class M2_60 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Pallavi");
		set.add("Java");
		set.add(2023);
		set.add(82.22);
		set.add(154658565);
		
		System.out.println("Set: "+set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

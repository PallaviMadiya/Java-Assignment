/*1)	Write a Java program to convert a hash set to an array. */

package Module2;
import java.util.*;

public class M2_69 {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("Pal");
		set.add("Java");
		set.add(2023);
		System.out.println("Set: "+set);
		
		List list = new ArrayList(set);
		System.out.println("List: "+list);
	}
}
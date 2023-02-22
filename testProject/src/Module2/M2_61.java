/*61)	Write a Java program to get the number of elements in a hash set. */

package Module2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class M2_61 {
	public static void main(String[] args){
	Set set = new HashSet();
		set.add("Pallavi");
		set.add("Java");
		set.add(2023);
		set.add(82.22);
		set.add(154658565);
		
		System.out.println("Set: "+set);
		System.out.println("Size of set: "+set.size());
	}
}
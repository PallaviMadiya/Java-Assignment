/*50) Write a Java program to iterate through all elements in an array list. */

package Module2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class M2_50 {
	public static void main(String[] args) {
		List ls = new ArrayList();
		ls.add("Pallavi");
		ls.add("Java");
		ls.add(80);
		ls.add(32.021);
		ls.add(false);
		ls.add('H');
		ls.add(125469815);
		
		System.out.println("List IS: "+ls);
		Iterator itr = ls.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}		
	}
}

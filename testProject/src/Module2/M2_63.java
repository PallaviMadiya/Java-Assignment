/*63)	Write a Java program to count the number of key-value (size) mappings in a map. */

package Module2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class M2_63 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("Name", "Pallavi");
		map.put("Course","Java");
		map.put("Year", 2023);
		
		System.out.println("Map: ");
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Size of map: "+map.size());
		
	}
}

/*62)	Write a Java program to associate the specified value with the specified key in a Hash Map. */

package Module2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class M2_62 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("Name", "Pallavi");
		map.put("Course","Java");
		map.put("Year", 2023);
		
		System.out.println("Map: "+map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

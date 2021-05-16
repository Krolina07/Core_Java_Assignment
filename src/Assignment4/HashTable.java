package Assignment4;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// 8. Get Set view of keys from HashTable.
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(1, "Swetha");
		map.put(2, "Jeena");
		map.put(3, "Karthika");
		map.put(4, "Tony");
		System.out.println("Elements of the Hashtable are: " + map);
		Enumeration e = map.keys();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}

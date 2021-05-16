package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class HashMapDuplicateCharacters {
	// 1. Find duplicate characters with their occurrences count using HashMap.
	static String[] list;

	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "W"); 
		hm.put(2, "E");
		hm.put(3, "L");
		hm.put(4, "L");
		hm.put(5, "C");
		hm.put(6, "O");
		hm.put(7, "M");
		hm.put(8, "E");

		System.out.println("Initial map: " + hm);

		String[] arr = new String[8];
		int j = 0;
		for (Map.Entry m : hm.entrySet())
		{
			arr[j] = (String) m.getValue();
			j = j + 1;
		}
		list = new String[8];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int k = 0; k < arr.length; k++) {
				if (arr[i] == arr[k]) {
					count++;
					if (number(arr[i])) {
						list[i] = arr[i];
					}
				}
			}
			if (list[i] != null) {
				if (count >= 2) {
					System.out.println("Number " + list[i] + " is duplicates ");
				}

			}
		}
	}

	static boolean number(String arr) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == arr) {
				return false;
			}
		}
		return true;
	}

}

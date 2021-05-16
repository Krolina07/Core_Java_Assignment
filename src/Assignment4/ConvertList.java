package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class ConvertList {
	static String[] list;

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// 4. Convert keys of a map to a list.
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("guest2", "223");
		hm.put("admin", "1234");
		hm.put("guest1", "332");

		System.out.println("Initial map: " + hm);
		int i = 0;
		list = new String[3];
		for (Map.Entry m : hm.entrySet()) {
			list[i] = m.getKey().toString();
			i = i + 1;
		}
		for (int j = 0; j < 3; j++) {
			System.out.println(list[j]);
		}

	}

}

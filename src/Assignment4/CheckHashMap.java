package Assignment4;

import java.util.HashMap;
import java.util.Map;

public class CheckHashMap {
//3. Check if a particular key exists in HashMap. 
	public static void main(String[] args) {

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("guest2", "223");
		hm.put("admin", "1234");
		hm.put("guest1", "332");
		String value = "admin";
		System.out.println("Check if a particular key ("+value+") exists in HashMap ");
		System.out.println("=========================================================");
		System.out.println("Initial map: " + hm);
		
		
		for (@SuppressWarnings("rawtypes") Map.Entry m : hm.entrySet()) {
			if (value == m.getKey()) {
				System.out.println("Result: "+ m.getKey()+" key exists in HashMap." );
			}

		}

	}

}

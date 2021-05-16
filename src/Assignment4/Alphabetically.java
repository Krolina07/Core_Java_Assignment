package Assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class Alphabetically {
//7. Sort ArrayList of Strings alphabetically. 

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("seetha");
		arrayList.add("Sudhin");
		arrayList.add("bala");
		arrayList.add("nithin");
		arrayList.add("Athira");

		Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);

		for (int i = 0; i < arrayList.size(); i++)
			System.out.println(arrayList.get(i));

	}
}

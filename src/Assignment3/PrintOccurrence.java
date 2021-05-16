package Assignment3;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintOccurrence {
	
	public static void main(String [] args){
		freqCount ("DevLabs Alliance Training");
	}

	public static void freqCount(String str) {

		str = str.replaceAll(" ", "");
		
		Map<Character, Integer> freqCount = new LinkedHashMap <Character, Integer> ();
		
		for (char ch : str.toCharArray()) {
			if (freqCount.containsKey(ch)) {
				freqCount.put(ch, (Integer)freqCount.get(ch)+1);
			}else {
				freqCount.put(ch, 1);
			}
			}
		System.out.println(freqCount);
		}

}

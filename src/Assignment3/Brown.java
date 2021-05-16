package Assignment3;

public class Brown {

	public static void main(String[] args) {
		// Write a program to check “brown” is present in the string: A brown fox ran
		// away fast

		String check = "A brown fox ran away fast";
		String word = "brown";
		String[] b1 = word.split("\\s+");
		for (String b2 : b1) {
		    if (check.contains(b2)) {
		        System.out.println("“brown” is present in the string");    
		    }else {
		    	 System.out.println("“brown” is not present in the string");
		    }
		}
	}
}

package Assignment3;

import java.util.Scanner;

public class StringToCharacter {

	public static void main(String[] args) {
		//  Write a program to convert String to a character array and character array to String
		char[] ch = new char[] {'W','E','L','C','O','M','E'};
		String str1 = String.valueOf(ch);
		System.out.println("=========Convert character to a String=========");
		System.out.println(str1);
		
		String str2 = "WELCOME";
		char[] ch2 = str2.toCharArray();
		System.out.println("=========Convert String to a character=========");
		for (char c:ch2) {
			System.out.println(c);
		}
		
	}

}

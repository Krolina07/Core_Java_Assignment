package Assignment3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		//Write a program to check if a given string is a palindrome or not
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter you String: ");
		String str = scan.next();
		String org_str = str;
		 String rev = "";
		 int len=str.length();
		 for(int i=len-1;i>=0;i--) {
			 rev = rev+str.charAt(i);
		 }
		 if (org_str.equals(rev)){
			 System.out.println(org_str + " is Palindrome String");
		 }else {
			 System.out.println(org_str + " is Not Palindrome String");
		 }
	}
}

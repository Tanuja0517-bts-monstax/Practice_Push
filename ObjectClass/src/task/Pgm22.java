package task;

import java.util.Scanner;

public class Pgm22 {
	public static boolean isPalindrome(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
			rev+=str.charAt(i);
		
		if(rev.equals(str))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.next();
		
		if(isPalindrome(str))
			System.out.println(str+" is Palindrome string");
		else
			System.out.println(str+" is not Palindrome string");
	}
}

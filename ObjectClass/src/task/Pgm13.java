package task;

import java.util.Scanner;

public class Pgm13 {
	public static String onlyAlphabets(String str) {
		String alpha="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z')
				alpha+=str.charAt(i);
		}
		return alpha;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		System.out.println("Original String:"+str);
		
		str=onlyAlphabets(str);
		System.out.println("Only alphabets string:"+str);
	}
}

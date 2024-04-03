package task;

import java.util.Scanner;

public class Pgm3 {
	public static String stringDupRemove(String str) {
		String removedDup="";
		for(int i=0;i<str.length();i++) {
			if(!removedDup.contains(String.valueOf(str.charAt(i))))  {
				removedDup+=str.charAt(i);
			}
		}
		return removedDup;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Original String:"+str);
		str=stringDupRemove(str);
		System.out.println("String after removing duplicates:"+str);
	}
}

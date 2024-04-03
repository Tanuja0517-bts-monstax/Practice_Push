package task;

import java.util.Scanner;

public class Pgm1 {
	
	public static String stringRev(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Original string:"+str);
		str=stringRev(str);
		System.out.println("Reversed string:"+str);
	}
}

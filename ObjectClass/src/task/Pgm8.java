package task;

import java.util.Scanner;

public class Pgm8 {
	public static String reverseSent(String str) {
		String temp[]=str.split(" ");
		String rev="";
		for(int i=temp.length-1;i>=0;i--) {
			rev+=temp[i]+" ";
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Original sentance:"+str);
		str=reverseSent(str);
		System.out.println("Reversed Sentance:"+str);
	}
}

package task;

import java.util.Scanner;

public class Pgm7 {
	public static String reverseSent_Word(String str) {
		String strArr[]=str.split(" ");
		String rev="";
		for(int i=strArr.length-1;i>=0;i--) {
			String temp=strArr[i]+" ";
			for(int j=temp.length()-1;j>=0;j--) {
				rev+=temp.charAt(j);
			}
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Origial:"+str);
		String rev=reverseSent_Word(str);
		System.out.println("Reversed:"+rev);
	}
}

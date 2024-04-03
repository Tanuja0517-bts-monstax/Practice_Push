package task;

import java.util.Scanner;

public class Pgm45 {
	public static void stringRev(String str1,String str2) {
		int str1l=str1.length();
		int str2l=str2.length();
		String temp=str1+str2;
		System.out.println(temp);
		str2="";
		str1="";
		for(int i=temp.length()-1;i>=temp.length()-str1l;i--)
			str2+=temp.charAt(i);
		for(int i=temp.length()-str2l-1;i>=0;i--)
			str1+=temp.charAt(i);
		System.out.println("Reversed Strings:"+str1+" "+str2);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st string:");
		String str1=sc.next();
		System.out.print("Enter 2nd strig:");
		String str2=sc.next();
		
		System.out.println("Original Strings:"+str1+" "+str2);
		stringRev(str1,str2);
	}
}

package task;

import java.util.Scanner;

public class Pgm11 {
	public static int uppercaseCount(String str) {
		int ct=0;
		for(int i=0;i<str.length();i++) {
			int temp=str.charAt(i);
			if(temp>=65 && temp<=90)
				ct++;
		}
		return ct;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		
		int ct=uppercaseCount(str);
		System.out.println("Count of upeercase charactrs in "+str+" is "+ct);
	}
}

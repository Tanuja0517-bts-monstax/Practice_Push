package task;

import java.util.Scanner;

public class Pgm10 {
	public static int countFirstOccurance(String str) {
		int ct=0;
		String temp="";
		for(int i=0;i<str.length()-1;i++) {
			if(!temp.contains(String.valueOf(str.charAt(i)))) {
				temp+=str.charAt(i);
				ct++;
			}
		}
		return ct;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String:");
		String str=sc.nextLine();
		
		int ct=countFirstOccurance(str);
		System.out.println("Count of first occurace of words character of "+str+" sentance is "+ct);
	}
}

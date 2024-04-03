package task;

import java.util.Scanner;

public class Pgm12 {
	public static String upperToLowerWiseVersa(String str) {
		String converted="";
		for(int i=0;i<str.length();i++) {
			int temp=str.charAt(i);
			if(temp>=65 && temp<=90) 
				converted+=(char)(temp+32);
			else if(temp>=97 && temp<=122)
				converted+=(char)(temp-32);
			else
				converted+=(char)temp;
		}
		return converted;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Original String:"+str);
		str=upperToLowerWiseVersa(str);
		System.out.println("Converted String:"+str);
	}
}

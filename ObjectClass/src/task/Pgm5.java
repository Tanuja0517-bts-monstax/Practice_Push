package task;

import java.util.Scanner;

public class Pgm5 {
	public static int stringSum(String str) {
		int sum=0;
		for(int i=0;i<str.length();i++) {
			int temp=str.charAt(i);
			if(temp>=48 && temp<=57) {
				sum+=temp-48;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		
		int sum=stringSum(str);
		System.out.println("Sum of integers in "+str+" is "+sum);
	}
}

package task;

import java.util.Scanner;

public class Pgm38 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		
		for(int i=0;i<str.length();i++) {
				for(int j=i;j<str.length();j++) {
						for(int k=j;k<str.length();k++) {
								System.out.print(str.charAt(k));
						}
						System.out.println();
			}
		}
	}
}

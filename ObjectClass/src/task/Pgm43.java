package task;

import java.util.Scanner;

public class Pgm43 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		String compressed="";
		int ct=0;
		int j=0;
		int ind=0;
		char ch=str.charAt(0);
			for(int i=ind;i<str.length();i++) {
				String temp="";
				System.out.println("i:"+i);
				if(ch==str.charAt(i)) {
					System.out.println("ch:"+ch+" str:"+str.charAt(i));
					System.out.println("if ind:"+ind);
					System.out.println("Hii");
					ct++;
				}
				else {
					temp=""+ch+ct;
					System.out.println("Ch:"+ch);
					ch=str.charAt(i);
					compressed=compressed+temp;
					System.out.println("index:"+ind);
					ct=0;
				}
				ind++;
		}
		System.out.println("Compressed:"+compressed);
		if(str.length()<compressed.length())
			System.out.println(str);
	}
}

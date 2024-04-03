package task;

import java.util.Arrays;
import java.util.Scanner;

public class Pgm4 {
	public static boolean isAnagram(String str1,String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char s1[]=str1.toCharArray();
		char s2[]=str2.toCharArray();
		boolean flag=false;
		if(s1.length==s2.length) {
			for(int i=0;i<s1.length;i++) {
				for(int j=0;j<s2.length;j++) {
					if(s1[i]==s2[j]) {
						s2[j]='0';
						flag=true;
						break; 
					}
					else 
						return false;
				}
			}
			return flag;
			
		}
		
		else 
			return flag;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st String:");
		String str1=sc.next();
		System.out.print("Enter 2nd String:");
		String str2=sc.next();
		
		if(isAnagram(str1,str2)) 
			System.out.println(str1+" and "+str2+" are anagram strings");
		else
			System.out.println(str1+" and "+str2+" are not anagram strings");
	}
}

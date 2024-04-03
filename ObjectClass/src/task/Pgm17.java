package task;

import java.util.Scanner;

public class Pgm17 {
	public static boolean isStrong(int num) {
		int temp=num;
		int result=0;
		while(temp>0) {
			int rem=temp%10;
			int prod=1;
			for(int i=1;i<=rem;i++) {
				prod*=i;
			}
			result+=prod;
			temp/=10;
		}
		if(num==result)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		if(isStrong(num))
			System.out.println(num+" is strong number");
		else
			System.out.println(num+" is not strong number");
	}
}

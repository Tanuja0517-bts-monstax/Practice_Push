package task;

import java.util.Scanner;

public class Pgm18 {
	public static boolean isArmstrong(int num,int power) {
		int result=0;
		int temp=num;
		while(temp>0) {
			int rem=temp%10;
			int product=1;
			for(int i=0;i<power;i++) {
				product*=rem;
			}
			result+=product;
			temp/=10;
		}
		
		if(result==num)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int temp=num,ct=0;
		while(temp>0) {
			temp/=10;
			ct++;
		}
		
		if(isArmstrong(num,ct)) 
			System.out.println(num+" is armstrong number");
		else
			System.out.println(num+" is not armstrong number");
	}
}

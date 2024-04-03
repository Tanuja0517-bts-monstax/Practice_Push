package task;

import java.util.Scanner;

public class Pgm19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		System.out.println("Enter number of time to extract the digits from the number:");
		int cycle=sc.nextInt();
		int temp=num;
		int ct=0;
		while(temp>0) {
			ct++;
			temp/=10;
		}
		int position=1;
		for(int i=0;i<ct;i++) {
			position*=10;
		}
		for(int i=0;i<cycle;i++) {
			while(position>0) {
				position/=10;
				int rem=num/position;
				System.out.println(rem);
				break;
			}
		}
	}
}

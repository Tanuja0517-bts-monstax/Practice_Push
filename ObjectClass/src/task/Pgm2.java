package task;

import java.util.Scanner;

public class Pgm2 {
	
	public static int numRev(int num) {
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Original number:"+num);
		num=numRev(num);
		System.out.println("Reversed number:"+num);
	}
}

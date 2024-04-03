package task;

import java.util.Scanner;

public class Pgm48 {
	public static int sumOfPrimeNum(int num) {
		int sum=0;
		for(int i=2;i<=num;i++) {
			int den=2;
			while(den<i) {
				if(i%den==0)
					break;
				den++;
			}
			if(den==i)
				sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		System.out.println("Sum of all prime number from 1 to "+num+" is "+sumOfPrimeNum(num));
	}
}

package task;

import java.util.Scanner;

public class Pgm6 {
	public static int sumOfDigits(int num) {
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		int sum=sumOfDigits(num);
		System.out.println("Sum of digits of "+num+" is "+sum);
	}
}

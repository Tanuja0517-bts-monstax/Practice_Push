package task;

import java.util.Scanner;

public class Pgm16 {
	public static boolean isPrime(int num) {
		int den=2;
		while(den<num) {
			if(num%den==0)
				return false;
			den++;
		}
		if(den==num)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		if(isPrime(num))
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");
	}
}

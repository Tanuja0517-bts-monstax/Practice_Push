package task;

import java.util.Scanner;

public class Pgm51 {
	public static int sumOfNaturalNum(int num) {
		if(num<=1)
			return 1;
		else
			return (num+sumOfNaturalNum(num-1));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Entre the number:");
		int num=sc.nextInt();
		
		int sum=sumOfNaturalNum(num);
		System.out.println("Sum of natural numbers from 1 to "+num+" is "+sum);
	}
}

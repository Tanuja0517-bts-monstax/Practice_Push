package task;

import java.util.Scanner;

public class Pgm21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int num1=sc.nextInt();
		System.out.print("Enter 2nd number:");
		int num2=sc.nextInt();
		System.out.println("Original number:"+num1+" "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Swapped number:"+num1+" "+num2);
	}
}

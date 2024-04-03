package task;

import java.util.Scanner;

public class Pgm37_Child extends Pgm37_Base{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers to perform arithmatic oprations:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		Pgm37_Base.add(a, b);
		sub(a, b);
		Pgm37_Base base=new Pgm37_Base();
		base.multiply(a, b);
		base.divide(a, b);
	}
}

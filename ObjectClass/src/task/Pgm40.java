package task;

import java.util.Scanner;

public class Pgm40 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number you want fibonaci upto:");
		int num=sc.nextInt();
		
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<num-2;i++) {
			int temp=n1+n2;
			System.out.print(temp+" ");
			n1=n2;
			n2=temp;
		}
	}
}

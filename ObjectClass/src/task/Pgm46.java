package task;

import java.util.Scanner;

public class Pgm46 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of diamond:");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i;j++)
				System.out.print(" ");
			for(int k=0;k<i*2-1;k++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=size;i>0;i--) {
			for(int j=0;j<size-i;j++)
				System.out.print(" ");
			for(int k=0;k<i*2-1;k++)
				System.out.print("*");
			System.out.println();
		}
	}
}

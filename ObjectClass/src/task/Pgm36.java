package task;

import java.util.Scanner;

public class Pgm36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of pattern:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i>=j)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}
	}
}

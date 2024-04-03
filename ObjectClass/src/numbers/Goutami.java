package numbers;

import java.util.Scanner;

public class Goutami {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int total=0;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				total=total+j;
			}
		}
		System.out.println("Total:"+total);
	}
}

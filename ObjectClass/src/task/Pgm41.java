package task;

import java.util.Scanner;

public class Pgm41 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the postion you want prime number:");
		int position=sc.nextInt();
		int num=3;
		int ct=1;
		for(;;) {
			int den=2;
			while(den<num) {
				if(num%den==0) {
					break;
					}
				den++;
			}
			if(den==num) {
				ct++;
			}
			if(ct==10) {
				break;
			}
			num++;
		}
		System.out.println(num);
	}
}

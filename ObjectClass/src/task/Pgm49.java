package task;

import java.util.Scanner;

public class Pgm49 {
	public static void amstrongNum(int num,int power) {
		
			int temp1=num;
			int result=0;
			
			while(num>0) {
				int pro=1;
				int rem=num%10;
				for(int i=0;i<power;i++)
					pro*=rem;
				result+=pro;
				num/=10;
			}
			if(result==temp1)
				System.out.println(result);
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number upto which you wnat the amstrogs:");
		int num=sc.nextInt();
		for(int i=1;i<num;i++) {
			int temp=i;
			int ct=0;
			while(temp>0) {
				temp/=10;
				ct++;
			}
			amstrongNum(i,ct);
		}
	}
}

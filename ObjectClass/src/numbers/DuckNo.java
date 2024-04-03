package numbers;

import java.util.Scanner;

public class DuckNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number which should not start with zero'0':");
		int num=sc.nextInt();
		int ct=0;
		int temp=num;
		while(num>0) {
			num/=10;
			ct++;
		}
		System.out.println("cout:"+ct);
		num=temp;
		int power=1;
		for(int i=0;i<ct-1;i++) {
			power*=10;
		}
		System.out.println("power:"+power);
		if(num%power!=0) {
			while(num>0)
			 {
				int rem=num%10;
				if(rem==0) {
					System.out.println(temp+" number is duck number");
					break;
				}
			}
		 num/=10;
		}
		else
			System.out.println(temp+" number is not duck number");
	}
}

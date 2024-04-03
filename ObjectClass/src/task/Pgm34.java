package task;

import java.util.Scanner;

public class Pgm34 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter elements in array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	}
}

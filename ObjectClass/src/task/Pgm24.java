package task;

import java.util.Scanner;

public class Pgm24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter elements in array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int smallest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest)
				smallest=arr[i];
		}
		System.out.println("Smallest element of array is "+smallest);
	}
}

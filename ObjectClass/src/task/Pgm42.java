package task;

import java.util.Scanner;

public class Pgm42 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter elements in array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Before reversing:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		int start=0;
		int end=arr.length-1;
		while(start<arr.length-1/2 ) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
				if(start>end)
					break;
			}
		System.out.println();
		System.out.println("After reversing:");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}

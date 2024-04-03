package task;

import java.util.Scanner;

public class Pgm26 {
	public static int secondlargest(int arr[],int largest) {
		int secLargest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(secLargest<arr[i] && arr[i]!=largest) 
				secLargest=arr[i];
		}
		return secLargest;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter elements in array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int largest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest)
				largest=arr[i];
		}
		System.out.println("Second largest element of the array:"+secondlargest(arr,largest));
		
	}
}

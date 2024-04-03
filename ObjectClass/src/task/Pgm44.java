package task;

import java.util.Scanner;

public class Pgm44 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter elements in array:");
		for(int i=0;i<arr.length;i++) 
			arr[i]=sc.nextInt();
		int firstLargest=arr[0];
		int secLargest=arr[0];
		int thirdLargest=arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]>firstLargest) 
					firstLargest=arr[j];
				if(arr[j]>secLargest && arr[j]<firstLargest)
					secLargest=arr[j];
				if(arr[j]>thirdLargest && arr[j]<secLargest)
					thirdLargest=arr[j];
			}
		}
		System.out.println("Third largest of array is:"+thirdLargest);
	}
}

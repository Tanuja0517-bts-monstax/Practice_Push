package task;

import java.util.Scanner;

public class Pgm31 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of 1st array:");
		int arr1[]=new int[sc.nextInt()];
		System.out.print("Enter size of 2nd array:");
		int arr2[]=new int[sc.nextInt()];
		
		System.out.print("Enter elements in array 1:");
		for(int i=0;i<arr1.length;i++)
			arr1[i]=sc.nextInt();
		System.out.print("Enter elements in array 2:");
		for(int i=0;i<arr2.length;i++)
			arr2[i]=sc.nextInt();
		
		int arr3[]=new int[arr1.length+arr2.length];
		int j=0,k=0;
		for(int i=0;i<arr3.length;i++) {
			if(i%2!=0 && j<arr1.length) {
				arr3[i]=arr2[j++];
			}
			else if(k<arr2.length || i==0) {
				arr3[i]=arr1[k++];
			}
		}
		
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+" ");
	}
}

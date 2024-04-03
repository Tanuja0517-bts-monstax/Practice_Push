package task;

import java.util.Scanner;

public class Pgm30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of 1st array:");
		int arr1[]=new int[sc.nextInt()];
		System.out.print("Enter size of 2nd array:");
		int arr2[]=new int[sc.nextInt()];
		
		System.out.print("Enter elements in 1st array:");
		for(int i=0;i<arr1.length;i++)
			arr1[i]=sc.nextInt();
		
		System.out.print("Eter elements in 2nd array:");
		for(int i=0;i<arr2.length;i++)
			arr2[i]=sc.nextInt();
		
		int arr3[]=new int[arr1.length+arr2.length];
		int j=0;
		for(int i=0;i<arr3.length;i++) {
			if(i<arr1.length) {
				arr3[i]=arr1[i];
			}
			if(i>=arr1.length && j<arr2.length) {
				arr3[i]=arr2[j];
				j++;
			}
		}
		
		for(int i=0;i<arr3.length;i++)
			System.out.print(arr3[i]+" ");	}
}

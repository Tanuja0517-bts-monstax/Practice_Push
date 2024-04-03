package task;

import java.util.Scanner;

public class Pgm27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter elements in the array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		int largest=0;
		int smallest=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(j+1<arr.length) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
		}
		System.out.print("Enter the position of the element to find the value:");
		int position=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(position==i)
				smallest=arr[position];
			if(position<arr.length) {
				largest=arr[arr.length-1-position];
			}
		}
		System.out.println("Samllest element of "+position+ " is "+smallest);
		System.out.println("Largest element of "+position+" is "+largest);
	}
}

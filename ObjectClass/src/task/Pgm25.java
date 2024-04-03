package task;

import java.util.Scanner;

public class Pgm25 {
	public static boolean isLinearSearch(int arr[],int key) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				flag=true;
				break;
			}
			else
				flag=false;
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int arr[]=new int[sc.nextInt()];
		System.out.print("Enter elements in array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.print("Enter the element to search:");
		int key=sc.nextInt();
		
		if(isLinearSearch(arr,key))
			System.out.println(key+" is present in the array");
		else
			System.out.println(key+" is not present in the array");
	}
}

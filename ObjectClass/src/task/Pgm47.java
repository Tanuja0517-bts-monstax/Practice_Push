package task;

import java.util.Scanner;

public class Pgm47 {
	public static void transposeMatrix(int arr[][],int row,int col) {
		int arr1[][]=new int [col][row];
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) 
					arr1[i][j]=arr[j][i];
		}
		
		System.out.println("Transpsed Matrix:");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++)
					System.out.print(arr1[i][j]+" ");
			System.out.println();	
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		System.out.print("Enter elements in array:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				arr[i][j]=sc.nextInt();
		}
		System.out.println("Original Matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}

		transposeMatrix(arr,row,col);
	}
}

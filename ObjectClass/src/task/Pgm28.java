package task;

import java.util.Scanner;

public class Pgm28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:");
		Student s[]=new Student[sc.nextInt()];
		
		for(int i=0;i<s.length;i++) {
			System.out.print("Enter Student ID:");
			int id=sc.nextInt();
			System.out.print("Enter Student Name:");
			sc.nextLine();
			String name=sc.nextLine();
			s[i]=new Student(id,name);
		}
		
		
		for(int i=0;i<s.length;i++)
			s[i].display();
	}
}

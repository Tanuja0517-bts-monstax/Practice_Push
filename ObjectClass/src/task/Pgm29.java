package task;

import java.util.ArrayList;
import java.util.Scanner;

public class Pgm29 {
	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList();
		
		al.add(new Emp(01,"Saloni Dhotkar","Automation Tester"));
		al.add(new Emp(02,"Sujata Samrutwar","API Trainer"));
		
		for(Emp e:al) {
			System.out.println(e.toString());;
		}
	}
}

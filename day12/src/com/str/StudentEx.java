package com.str;
import java.util.HashSet;
import java.util.Scanner;
public class StudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number of employees :");
		HashSet<Double> hs=new HashSet<>();
		int n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter employee id :");
			s.nextInt();
			System.out.println("enter employee name :");
			s.next();
			System.out.println("enter employee salary :");
			s.nextInt();
			System.out.println("enter employee age :");
			s.nextInt();
			System.out.println("enter employee experience :");
			s.nextInt();
			
		}
			System.out.println(s);
		
	}

}

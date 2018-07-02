package com.Learning1;

import java.util.Scanner;

public class controlStatements {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter value for a");
		int a= sc.nextInt();
		
		System.out.println("Enter value for b");
		int b= sc.nextInt();
		
		System.out.println("Enter value for c");
		int c= sc.nextInt();
		
		if(a>b&&a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
			 	 	

	}

}

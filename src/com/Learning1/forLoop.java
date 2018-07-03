package com.Learning1;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value for initializing i");
		int a=sc.nextInt();
		System.out.println("Enter value for interating loop");
		int b=sc.nextInt();

		for (int i=a; i<b;i++)
		{
			System.out.println(i);
			
			if(i==(b-a))
			{
				break;
			}
		}
	}

}

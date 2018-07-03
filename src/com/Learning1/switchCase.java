package com.Learning1;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a course");
		String a=s.nextLine();
		String course=a;
		
		switch (course)
		{
		
		case "selenium":
		{
			System.out.println("you chosen selenium");
			break;
		}
		
		case "Qtp":
		{
			System.out.println("you chosen qtp");
			break;
		}
		
		default:
			System.out.println("select a proper option");
			break;
		
	}

}
}

package com.Learning1;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList <Object> a=new ArrayList<Object>();
		a.add("Selenium Course");
		a.add("4000, is the fee");
		a.add(5);
		a.add('T');
		a.add(true);
		
		System.out.println(a.size());
		for(int i=0;i< a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		
		
	}

}

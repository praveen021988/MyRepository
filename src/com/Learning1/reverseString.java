package com.Learning1;

public class reverseString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String reverse="";
		String Orginal="learning";
		int length=Orginal.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+ Orginal.charAt(i);
		}
		System.out.println(reverse);
	
	}

}

package com.Learning2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class titleUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expurl="demo.nopcommerce.com";
		String expval="nopCommerce";
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		
		String actval=driver.getTitle();
		System.out.println(actval);
		String acturl=driver.getCurrentUrl();
		System.out.println(acturl);
		
		if(actval.contains(expval))
		{
			System.out.println("Title case is PASS");
		}
		else
		{
			System.out.println("Title case is Fail");
		}
		if (acturl.contains(expurl))
		{
			System.out.println("URL case is pass");
		}
		else
		{
			System.out.println("URL case is Fail");
		}
		
		
		

	}

}

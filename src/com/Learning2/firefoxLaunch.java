package com.Learning2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxLaunch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.close();
		
	}

}

package com.Learning4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;


public class Alerts {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://192.168.1.100/primusbank1");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtuId")).sendKeys("webdr");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		Alert alt=driver.switchTo().alert();
		//Sleeper.sleepTightInSeconds(5); 
		System.out.println(alt.getText());
		//Sleeper.sleepTightInSeconds(5); 
		alt.accept();
		
//		alt.dismiss();

	}

}

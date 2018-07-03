package com.Learning4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		
			WebDriver driver=new FirefoxDriver();
			driver.get("http://opensource.demo.orangehrm.com/");
			driver.manage().window().maximize();
			
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin");
			driver.findElement(By.id("btnLogin")).click();
			
			driver.findElement(By.linkText("PIM")).click();
			driver.findElement(By.linkText("Add Employee")).click();
			
			driver.findElement(By.id("photofile")).click();
			Thread.sleep(50);
			Runtime.getRuntime().exec("D:\\fileupload_2.exe");
		}
	}



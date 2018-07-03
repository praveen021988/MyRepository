package com.Learning4;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class fileDownload {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://docs.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("2.53.0")).click();
		
		Thread.sleep(5000);;
		
		Runtime.getRuntime().exec("D:\filedownload.exe");
		

	}

}


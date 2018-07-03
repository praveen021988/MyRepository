package com.Learning2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ieLaunche {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","D:\\Automation\\IEDriverServer_Win32_2.53.1\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();

	}

}

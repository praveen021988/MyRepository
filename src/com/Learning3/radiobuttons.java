package com.Learning3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radiobuttons {

	public static void main(String[] args) 
	{
		String expval="cheese";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		driver.manage().window().maximize();
		
//		WebElement  block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> radio=driver.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(radio.size());
		for (int i = 0; i < radio.size(); i++) 
		{
			String radiotext=radio.get(i).getAttribute("value");
			System.out.println(radiotext);
			
			System.out.println(radiotext+" "+radio.get(i).getAttribute("checked"));
//			if (expVAL.EQUALSIGNORECASE(RADIOTEXT))
//			{
//				RADIO.GET(I).CLICK();
//				SYSTEM.OUT.PRINTLN(RADIO.GET(I).GETATTRIBUTE("CHECKED"));
//				BREAK;
//			}
		}

	}

}

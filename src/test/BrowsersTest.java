package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generics.Utility;

public class BrowsersTest 
{
	WebDriver driver;
	@Test
	public void testChrome() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		int rowcount = Utility.GetRowCount("./TestData/browser.xlsx", "sheet1");
		for(int i=0;i<rowcount;i++)
		{
			driver= new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.id("lst-ib")).sendKeys("abc");
		}
		
	}

}

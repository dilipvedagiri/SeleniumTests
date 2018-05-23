package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.Utility;

public class LoginPage 
{
	WebDriver driver;
	@FindBy(id="userid")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="btnActive")
	private WebElement Signin;
	
	@FindBy(id="pt1:_UIShome::icon")
	private WebElement homePagelink;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Login() throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		//int rc = Utility.GetRowCount("./TestData/InputData.xlsx","Login");
		String Username=Utility.GetCellValue("./TestData/InputData.xlsx","Login", 1, 0);
		String Password=Utility.GetCellValue("./TestData/InputData.xlsx","Login", 1, 1);
		System.out.println(Username);
		System.out.println(Password);
		username.sendKeys(Username);
		password.sendKeys(Password);
		Signin.click();
	}
	
	public void CloseBrowser()
	{
		driver.close();
	}
	
}

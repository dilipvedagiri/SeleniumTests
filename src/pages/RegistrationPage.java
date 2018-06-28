package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage
{
	@FindBy(xpath="//input[@placeholder='First Name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@ng-model='Adress']")
	private WebElement txtaddress;
	@FindBy(xpath="//input[@ng-model='EmailAdress']")
	private WebElement txtemail;

	public RegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void Set_first_lastName(String firstName,String lastName) 
	{
		firstname.sendKeys(firstName);
		lastname.sendKeys(lastName);
		
	}
	
	public void Set_address_email(String address,String email) 
	{
		txtaddress.sendKeys(address);
		txtemail.sendKeys(email);
		
	}

}

package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Reusable 
{
	static WebDriver driver;
	public Reusable(WebDriver driver) 
	{
		this.driver=driver;
	}
	public static void GenericActions(WebElement element)
	{
		Actions action= new Actions(driver);
		action.moveToElement(element).build().perform();
	}

}

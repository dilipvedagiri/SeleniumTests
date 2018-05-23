package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * @author dvedagiri
 *
 */
public class BasePage 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void Click(WebElement element)
	{
		wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public void SendKeys(WebElement element,String data)
	{
		wait= new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.clear();
		element.sendKeys(data);
	}
	/**Select the Drop down Value based on the Text*/
	public void SelectByVisibleText(WebElement element,String text)
	{
		Select select= new Select(element);
		select.selectByVisibleText(text);
	}
	public void SelectByValue(WebElement element,String text)
	{
		Select select= new Select(element);
		select.selectByValue(text);
	}
	public void SelectByIndex(WebElement element,int index)
	{
		Select select= new Select(element);
		select.selectByIndex(index);
	}
}

package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest 
{
	@Test
	public void testgridTest() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\OracleFramework\\drivers\\chromedriver.exe");
		// We have to mention browser which we want to use for test execution
		ChromeOptions cap=new ChromeOptions();
		 
		// Set the platform where we want to run our test- we can use MAC and Linux and other platforms as well
		//cap.setPlatform(Platform.WINDOWS);
		 
		// Here you can use hub address, hub will take the responsibility to execute the test on respective node
		URL url=new URL("http://localhost:4444/wd/hub");
		 
		// Create driver with hub address and capability
		WebDriver driver=new RemoteWebDriver(url, cap);
		 
		// start application
		driver.get("https://www.google.com/");
		 
		// get the title and print the same
		System.out.println("Browser  title is "+driver.getTitle());
		 
		driver.close();
	}

}

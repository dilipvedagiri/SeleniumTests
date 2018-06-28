package test;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import generics.Screenshots;

/**Base Test Containing initializing Extent Report Parameterise Browser and Log the Status of the Test to the report
 * @author dvedagiri
 *
 */
public class BaseTest 
{
	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentHtmlReporter htmlReporter;
	public WebDriver driver;
	Capabilities capabilities;
	String browsername;
	String browserversion;
	String testCaseName;
	@BeforeSuite
	public void initReport()
	{
		extent = new ExtentReports();	
		SimpleDateFormat sdf= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date= new Date();
		String timestamp=sdf.format(date);
		htmlReporter = new ExtentHtmlReporter("./report/TestReport_"+timestamp+".html");
		extent.attachReporter(htmlReporter);		
		
		// make the charts visible on report open
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Regression Suite"); 
        
        Properties prop = System.getProperties();	
		extent.setSystemInfo("User Name",prop.getProperty("user.name").toUpperCase());
		extent.setSystemInfo("OS Version",prop.getProperty("os.name").toUpperCase());
	}
	@BeforeMethod
	@Parameters({"browser"})
	public void initTest(String browser) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver= new ChromeDriver();
			capabilities = ((RemoteWebDriver) driver).getCapabilities();
			browsername = capabilities.getBrowserName();
			browserversion=capabilities.getVersion();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			capabilities = ((RemoteWebDriver) driver).getCapabilities();
			browsername = capabilities.getBrowserName();
			browserversion=capabilities.getVersion();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./Drivers/MicrosoftWebDriver.exe");
			driver= new EdgeDriver();
			capabilities = ((RemoteWebDriver) driver).getCapabilities();
			browsername = capabilities.getBrowserName();
			browserversion=capabilities.getVersion();
		}	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		/*driver.get("https://ehci-test.fa.us6.oraclecloud.com/");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.Login();	*/
	}
	@AfterMethod
	public void Close_Browser(ITestResult result)
	{	
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, testCaseName+" executed successfully");
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL,testCaseName+" execution failed");
			Screenshots.ScreenCapture(driver,result);
			test.fail(result.getThrowable());
		}	
		else
		{
			test.log(Status.SKIP,testCaseName+" execution Skipped");
			test.skip(result.getThrowable());
		}
		driver.quit();
	}
	@AfterSuite
	public void CloseReport()
	{
		extent.setSystemInfo("Browser Name",browsername.toUpperCase());
		extent.setSystemInfo("Browser Version",browserversion.toUpperCase());
		
		extent.flush();
	}

}

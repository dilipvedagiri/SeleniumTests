package test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import generics.Screenshots;
import pages.LoginPage;

/**Base Test Containing initializing Extent Report Parameterise Browser and Log the Status of the Test to the report
 * @author dvedagiri
 *
 */
public class BaseTest 
{
	public ExtentReports extent;
	public ExtentTest test;
	public ExtentHtmlReporter htmlReporter;
	public WebDriver driver;
	@BeforeClass
	public void initReport()
	{
		extent = new ExtentReports();	
		//extent.attachReporter(getHtmlReporter());
		SimpleDateFormat sdf= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date= new Date();
		String timestamp=sdf.format(date);
		htmlReporter = new ExtentHtmlReporter("./report/TestReport_"+timestamp+".html");
		extent.attachReporter(htmlReporter);
		
		/*extent.setSystemInfo("OS","Windows 10");
		extent.setSystemInfo("HostName","DilipKumar");
		extent.setSystemInfo("Environment Name","QA");
		extent.setSystemInfo("UserName","DilipKumar");
		
		// make the charts visible on report open
        htmlReporter.config().setChartVisibilityOnOpen(true);
		
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Regression Suite");*/
        
	}
	@BeforeMethod
	@Parameters({"browser"})
	public void initTest(String browser) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://ehci-test.fa.us6.oraclecloud.com/");
		LoginPage loginpage= new LoginPage(driver);
		loginpage.Login();	
	}
	@AfterMethod
	public void Close_Browser(ITestResult result)
	{	
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "Test Case is failed");
			Screenshots.ScreenCapture(driver,result);
			test.fail(result.getThrowable());
		}	
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test Case is Pass");
		}
		else
		{
			test.log(Status.SKIP, "Test Case is Skipped");
			test.skip(result.getThrowable());
		}
		driver.quit();
	}
	@AfterClass
	public void CloseReport()
	{
		extent.flush();
	}

}

package generics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;

public class Screenshots 
{
	public static void ScreenCapture(WebDriver driver,ITestResult result)
	{
		SimpleDateFormat sdf= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		Date date= new Date();
		String timestamp=sdf.format(date);
		String testname=result.getName();
		EventFiringWebDriver e= new EventFiringWebDriver(driver);
		File srcFile = e.getScreenshotAs(OutputType.FILE);
		File dstFile=new File("./Screenshot/"+testname+timestamp+".png");
		try 
		{
			FileUtils.copyFile(srcFile, dstFile);
		}
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}

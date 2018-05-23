package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

import pages.AssetRetirementsPage;

/**
 * @author dvedagiri
 *
 */
public class AssetRetirements extends BaseTest
{
	@Test
	public void testAssetRetirements() throws Exception
	{
		test=extent.createTest("AssetRetirements", "Executing Asset Retirement Test");
		AssetRetirementsPage assetretirementspage= new AssetRetirementsPage(driver);
		test.log(Status.INFO, "Navigating to Retire Assets");
		assetretirementspage.NavigatetoRetireAssets();
		test.log(Status.INFO, "Enter the required fields in Retire Assets");
		assetretirementspage.Retire_Assets();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,400)");
		test.log(Status.INFO, "View Accounting");
		assetretirementspage.View_Accounting();
		
	}

}

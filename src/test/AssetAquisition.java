package test;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import pages.AssetAquisitionPage;

/**
 * @author dvedagiri
 *
 */
public class AssetAquisition extends BaseTest
{
	@Test
	public void testAssetAquisition() throws Exception
	{
		test=extent.createTest(this.getClass().getSimpleName(), "Executing Asset Aquisition Test");
		AssetAquisitionPage assetaquisitionpage = new AssetAquisitionPage(driver);
		test.log(Status.INFO, "Navigating to Add Assets");
		assetaquisitionpage.NavigatetoAddAssets();
		test.log(Status.INFO, "Enter the required fields in Add Assets");
		assetaquisitionpage.Add_Assets();		
	}

}

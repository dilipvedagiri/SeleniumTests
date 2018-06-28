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
	@Test(dataProvider="addAssets")
	public void testAssetAquisition(String majcategry,String mincategry,String desc,String costval,String expacc,String cntry,
			String statevalue,String cityvalue,String insrvcdate,String assrtkey,String empname,String descenquiry) throws Exception
	{
		testCaseName = this.getClass().getSimpleName();
		test=extent.createTest(testCaseName, "Executing Asset Aquisition Test");
		AssetAquisitionPage assetaquisitionpage = new AssetAquisitionPage(driver);
		test.log(Status.INFO, "Navigating to Add Assets");
		assetaquisitionpage.NavigatetoAddAssets();
		test.log(Status.INFO, "Enter the required fields in Add Assets");
		assetaquisitionpage.Add_Assets(majcategry,mincategry,desc,costval,expacc,cntry,
				statevalue,cityvalue,insrvcdate,assrtkey,empname,descenquiry);		
	}

}

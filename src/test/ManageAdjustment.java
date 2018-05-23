package test;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import pages.ManageAdjustmentPage;

/**
 * @author dvedagiri
 *
 */
public class ManageAdjustment extends BaseTest
{
	@Test
	public void testCreate_BankAccount() throws Exception
	{
		testCaseName = this.getClass().getSimpleName();
		test=extent.createTest(testCaseName, "Executing Manage Adjustment Test");
		ManageAdjustmentPage manageadjustment = new ManageAdjustmentPage(driver);
		test.log(Status.INFO, "Navigate to Manage Transaction");
		manageadjustment.NavigatetoManageTransaction();
		test.log(Status.INFO, "Navigate to Manage Transaction");
		manageadjustment.Manage_Adjustment();
		test.log(Status.INFO, "Enter the required fields in Manage Transaction");
		manageadjustment.Add_ManageAdjustments();
		test.log(Status.INFO, "View Balance Details");
		manageadjustment.View_Balance();
	}

}

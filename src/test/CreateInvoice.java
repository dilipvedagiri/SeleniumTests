package test;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import pages.Receivables;

/**
 * @author dvedagiri
 *
 */
public class CreateInvoice extends BaseTest
{
	@Test
	public void testCreateInvoice() throws Exception
	{
		testCaseName = this.getClass().getSimpleName();
		test=extent.createTest(testCaseName, "Executing Create Invoice Test");
		Receivables receivables = new Receivables(driver);
		test.log(Status.INFO, "Navigate to Receivables");
		receivables.CreateReceivables();
		test.log(Status.INFO, "Navigate to Create Invoice");
		receivables.Create_Invoice();
		//receivables.CloseBrowser();
	}

}

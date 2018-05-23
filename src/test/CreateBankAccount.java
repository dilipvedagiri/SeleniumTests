package test;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import pages.CreateBankAccountPage;

/**
 * @author dvedagiri
 *
 */
public class CreateBankAccount extends BaseTest 
{
	@Test
	public void testCreate_BankAccount() throws Exception
	{
		test=extent.createTest(this.getClass().getSimpleName(), "Executing Create Bank Account Test");
		CreateBankAccountPage createbankaccountpage= new CreateBankAccountPage(driver);
		test.log(Status.INFO, "Navigating to Bank Account");
		createbankaccountpage.NavigatetoBankAccount();
		test.log(Status.INFO, "Navigating to Create Bank Account");
		createbankaccountpage.Create_BankAccount();
		test.log(Status.INFO, "Enter the required fields in Business Unit Access");
		createbankaccountpage.BusinessUnitAccess();
		test.log(Status.INFO, "Enter the required fields in Add Payment Documents");
		createbankaccountpage.AddPaymentDocuments();
		test.log(Status.INFO, "Save and Validate");
		createbankaccountpage.Save_Validation();
	}

}

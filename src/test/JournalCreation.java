package test;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import pages.JournalCreationPage;

/**
 * @author dvedagiri
 *
 */
public class JournalCreation extends BaseTest
{
	@Test
	public void testJournalCreation() throws Exception
	{
		testCaseName = this.getClass().getSimpleName();
		test=extent.createTest(testCaseName, "Executing Journal Creation Test");
		JournalCreationPage jcpage= new JournalCreationPage(driver);
		test.log(Status.INFO, "Navigate to Create Journal");
		jcpage.NavigatetoCreateJournal();
		test.log(Status.INFO, "Enter required fields in Create Journal");
		jcpage.Create_Journal();
		test.log(Status.INFO, "Navigate to Manage Journal and Post Journal created");
		jcpage.Manage_Journal();
	}

}

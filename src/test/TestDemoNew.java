package test;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

public class TestDemoNew extends BaseTest
{
	@Test
	public void demotestnew()
	{
		testCaseName = this.getClass().getSimpleName();
		System.out.println("Class Name is:"+testCaseName);
		test=extent.createTest(testCaseName, "Executing Valid Login Tests");
		System.out.println("Testing");	
		test.log(Status.INFO,"Logged in");
		
	}

}

package test;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

public class TestDemo extends BaseTest
{
	@Test
	public void demotest()
	{
		testCaseName = this.getClass().getSimpleName();
		System.out.println("Class Name is:"+testCaseName);
		test=extent.createTest(testCaseName, "Executing Valid Login Tests");
		System.out.println("Testing Demo");	
		test.log(Status.INFO,"Logged in");
		
	}

}

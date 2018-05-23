package test;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class TestDemo extends BaseTest
{
	@Test
	public void demotest()
	{
		test=extent.createTest("ValidLogin", "Executing Valid Login Tests");
		System.out.println("Testing");
		test.log(Status.INFO,"Logged in");
		
	}

}

package practice;

import org.testng.annotations.Test;

@Test(groups= {"regression"})
public class GroupTest 
{
	@Test(groups= {"smoke"})
	public void testA()
	{
		System.out.println("Regression and Smoke");
	}
	
	public void testB()
	{
		System.out.println("Regression only");
	}

}

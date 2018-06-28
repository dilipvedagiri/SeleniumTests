package practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class ParameterTest 
{
	@Parameters({"browser_name"})
	@Test
	public void testparameter(String browser) 
	{
		System.out.println(browser);
	}
	

}

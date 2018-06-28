package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generics.Utility;
import pages.RegistrationPage;

public class Registration extends BaseTest
{
	@DataProvider(name="names")
	public Object[][] readname()
	{
		Object[][] data = new Object[1][2];
		data[0][0]="dilip";
		data[0][1]="kumar";
		return data;
	}
	@DataProvider(name="address")
	public Object[][] readaddress()
	{
		Object[][] data = new Object[1][2];
		data[0][0]="dilip";
		data[0][1]="kumar";
		return data;
	}
	
	@DataProvider(name="testdata")
	public Object[][] readfromexcel() throws Exception
	{
		Object[][] exceldata = Utility.ReadExceldata("./TestData/browser.xlsx", "Input");
		return exceldata;
	}
	@Test(dataProvider="names",enabled=false)
	public void testResgistration(String firstName,String lastName)
	{
		RegistrationPage rp= new RegistrationPage(driver);
		
		rp.Set_first_lastName(firstName, lastName);
	}
	@Test(dataProvider="testdata")
	public void testResgistrationnew(String firstName,String lastName)
	{
		System.out.println("FirstName is:"+firstName);
		System.out.println("LastName is:"+lastName);
	}

}

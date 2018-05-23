package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generics.Utility;

public class AssetAquisitionPage extends BasePage
{
	@FindBy(id="pt1:_UIShome::icon")
	private WebElement homePagelink;
	
	@FindBy(id="groupNode_fixed_assets")
	private WebElement fixedassets;
	
	@FindBy(id="itemNode_fixed_assets_additions")
	private WebElement assets;
	
	@FindBy(id="pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon")
	private WebElement tasks;
	
	@FindBy(xpath="//*[text()='Add Asset']")
	private WebElement addasset;
	
	@FindBy(id="pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf1KBIMG::icon")
	private WebElement categoryicon;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf1SPOP_query:value00::content']")
	private WebElement majorcategory;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf1SPOP_query:value10::content']")
	private WebElement minorcategory;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf1SEl']")
	private WebElement categoryok;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:descriptionId::content']")
	private WebElement description;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:it1::content']")
	private WebElement cost;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf2CS::content']")
	private WebElement expenseaccount;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3KBIMG::icon']")
	private WebElement locationicon;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value00::content']")
	private WebElement country;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value10::content']")
	private WebElement state;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value20::content']")
	private WebElement city;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SPOP_query:value20::_fndSuggestPopup']/li/span[2]")
	private WebElement cityVALUE;
		
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:kf3SEl']")
	private WebElement locationok;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:dynam1:0:commandButton1']")
	private WebElement next;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:DatePlacedInService1::content']")
	private WebElement inservicedate;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:kf2CS::content']")
	private WebElement assertkey;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:AT1:_ATp:table1:0:employeeNameId::content']")
	private WebElement employeename;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:ap1:commandButton15']/a")
	private WebElement submit;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSsdiitemNode_fixed_assets_inquiry::tia']")
	private WebElement assetenquiry;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r2:0:q1:value20::content']")
	private WebElement descriptionenquiry;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r2:0:q1::search']")
	private WebElement assetenquirysearch;
	
	String xlpath="./TestData/InputData.xlsx";
	String sheetname="AssetAquisition";
	
	public AssetAquisitionPage(WebDriver driver)
	{
		super(driver);
	}
	public void NavigatetoAddAssets() throws InterruptedException
	{
		homePagelink.click();
		Click(fixedassets);
		Click(assets);
		Click(tasks);
		Click(addasset);
	}
	public void Add_Assets() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String majcategry=Utility.GetCellValue(xlpath, sheetname, 1, 0);
		String mincategry=Utility.GetCellValue(xlpath, sheetname, 1, 1);
		String desc=Utility.GetCellValue(xlpath, sheetname, 1, 2);
		String costval=Utility.GetCellValue(xlpath, sheetname, 1, 3);
		String expacc=Utility.GetCellValue(xlpath, sheetname, 1, 4);
		String cntry=Utility.GetCellValue(xlpath, sheetname, 1, 5);
		String statevalue=Utility.GetCellValue(xlpath, sheetname, 1, 6);
		String cityvalue=Utility.GetCellValue(xlpath, sheetname, 1, 7);
		String insrvcdate=Utility.GetCellValue(xlpath, sheetname, 1, 8);
		String assrtkey=Utility.GetCellValue(xlpath, sheetname, 1, 9);
		String empname=Utility.GetCellValue(xlpath, sheetname, 1, 10);
		String descenquiry=Utility.GetCellValue(xlpath, sheetname, 1,11);
		
		Click(categoryicon);
		Thread.sleep(7000);
		majorcategory.sendKeys(majcategry);
		minorcategory.sendKeys(mincategry);
		Click(categoryok);
		Thread.sleep(3000);
		description.sendKeys(desc);
		cost.sendKeys(costval);
		expenseaccount.clear();
		expenseaccount.sendKeys(expacc);
		Thread.sleep(5000);
		locationicon.click();
		Thread.sleep(7000);
		country.sendKeys(cntry);
		state.sendKeys(statevalue);
		city.sendKeys(cityvalue);
		Thread.sleep(3000);
		cityVALUE.click();
		Thread.sleep(3000);
		locationok.click();
		Thread.sleep(3000);
		next.click();
		inservicedate.clear();
		inservicedate.sendKeys(insrvcdate);
		assertkey.sendKeys(assrtkey);
		employeename.sendKeys(empname);
		submit.click();
		Thread.sleep(5000);
		assetenquiry.click();
		Thread.sleep(3000);
		descriptionenquiry.sendKeys(descenquiry);
		Thread.sleep(3000);
		assetenquirysearch.click();
	}
}

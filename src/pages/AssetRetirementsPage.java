package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import generics.Utility;

public class AssetRetirementsPage extends BasePage
{	
	@FindBy(xpath="//*[@id='pt1:_UIShome::icon']")
	private WebElement homePagelink;
	
	@FindBy(xpath="//*[@id='groupNode_fixed_assets']")
	private WebElement fixedassets;
	
	@FindBy(xpath="//*[@id='itemNode_fixed_assets_additions']")
	private WebElement assets;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTsdi__AssetsDashboard_itemNode__FndTasksList::icon']")
	private WebElement tasks;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl11']")
	private WebElement retireasset;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:q1:value10::content']")
	private WebElement assetnumber;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:q1::search']")
	private WebElement searchbtn;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:findAssetVCQueryResultId:_ATp:cb2']")
	private WebElement retirecost;
		
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:costRetired::content']")
	private WebElement costretired;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:costOfRemoval::content']")
	private WebElement costofremoval;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:selectOneChoice3::content']")
	private WebElement retirementreason;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:1:AP2:commandButton7']/a")
	private WebElement submitbtn;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:1:Searc1:0:AP1:cb1']")
	private WebElement doneretireassets;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:_FOTRaT:0:RAtl17']")
	private WebElement createaccounting;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:pt1:r1:requestBtns:submitButton']/a")
	private WebElement submitretireassets;
	
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_additions:0:MAnt2:2:pt1:r1:requestBtns:confirmationPopup:confirmSubmitDialog::ok']")
	private WebElement okbtn;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSsdiitemNode_fixed_assets_inquiry::tia']")
	private WebElement assetenquiry;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r2:0:q1:value10::content']")
	private WebElement assetenquiryassetnumber;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r2:0:q1::search']")
	private WebElement assetenquirysearch;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r2:0:sdi8::ti']/div")
	private WebElement assetenquirytransactions;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_fixed_assets_inquiry:1:_FOTsr1:0:AP4:r1:0:r2:0:AT3:_ATp:ctb2']")
	private WebElement viewaccounting;
	
	String xlpath="./TestData/InputData.xlsx";
	String sheetname="AssetRetirement";
		
	//Constructor to initialize the web elements
	public AssetRetirementsPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void NavigatetoRetireAssets()
	{
		homePagelink.click();
		Click(fixedassets);	
		Click(assets);	
		Click(tasks);	
		Click(retireasset);
	}
	public void Retire_Assets() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String assetnum=Utility.GetCellValue(xlpath, sheetname, 1, 0);
		String costretiredvalue=Utility.GetCellValue(xlpath, sheetname, 1, 1);
		String costremovalvalue=Utility.GetCellValue(xlpath, sheetname, 1, 2);
		String retmntreason=Utility.GetCellValue(xlpath, sheetname, 1, 3);
		String assetenquirynum=Utility.GetCellValue(xlpath, sheetname, 1, 4);
		
		SendKeys(assetnumber, assetnum);
		Click(searchbtn);
		Click(retirecost);
		SendKeys(costretired, costretiredvalue);
		costofremoval.sendKeys(costremovalvalue);
		SelectByVisibleText(retirementreason, retmntreason);
		Click(submitbtn);
		Click(doneretireassets);
		Click(tasks);
		Click(createaccounting);
		Click(submitretireassets);
		Click(okbtn);
		Click(assetenquiry);
		assetenquiryassetnumber.sendKeys(assetenquirynum);
		Click(assetenquirysearch);		
	}
	public void View_Accounting() 
	{
		Click(assetenquirytransactions);
		Click(viewaccounting);
	}
}

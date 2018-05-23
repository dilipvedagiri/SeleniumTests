package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import generics.Utility;

public class CreateBankAccountPage extends BasePage
{
	@FindBy(xpath="//*[@id='pt1:_UIScmil1u::icon']")
	private WebElement userdropdown;
	
	@FindBy(xpath="//*[text()='Setup and Maintenance...']")
	private WebElement setupmaintainance;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:it2::content']")
	private WebElement txtsearchtasks;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:r0:0:r1:0:AP1:s92:ctb3::icon']")
	private WebElement searchicon;
	
	@FindBy(xpath="//*[text()='Manage Bank Accounts']")
	private WebElement managebankaccounts;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:0:ap1:bankAccountVOCriteriaQueryResultId:_ATp:create::icon']")
	private WebElement addicon;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:bankBranchNameT1Id::content']")
	private WebElement bankbranch;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:inputText1::content']")
	private WebElement accountname;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:inputText2::content']")
	private WebElement accountnumber;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:CurrencyCode::content']")
	private WebElement selectcurrency;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:AccountOwner::content']")
	private WebElement legalentityname;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:ApUseAllowed::content']")
	private WebElement payablescheckbox;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:ArUseAllowed::content']")
	private WebElement receivablescheckbox;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf1KBIMG::icon']")
	private WebElement cashsearch;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf1SPOP_query:value00::content']")
	private WebElement llusentity;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf1SPOP_query:value00::lovIconId']")
	private WebElement llusentitydropdown;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf1SPOP_query:value00::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td[1]")
	private WebElement llusentityvalue;
	
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf1SPOP_query:value00::_fndSuggestPopup']/li/span[2]")
	private WebElement llusentityvalue1;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf1SPOP_query:value10::content']")
	private WebElement llusprofitcentre;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf1SPOP_query:value20::content']")
	private WebElement llusaccount;
	
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf1SPOP_query:value30::content']")
	private WebElement lluscostcentre;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf1SEl']")
	private WebElement costok;
	
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf1CS::content']")
	private WebElement cash;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:kf3CS::content']")
	private WebElement cashclearing;
	
	@FindBy(xpath="//*[text()='Business Unit Access']")
	private WebElement businessunitaccess;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:AT5:_ATp:create::icon']")
	private WebElement businessunitcreateicon;
	
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:AT5:bUNameId::content']")
	private WebElement businessunit;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:AT5:okBu']")
	private WebElement businessunitokbtn;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:showDetailItem1::disAcr']")
	private WebElement general;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:AT3:_ATp:create::icon']")
	private WebElement paymentdocumentaddicon;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:AT3:inputText19::content']")
	private WebElement paymentdocument;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:AT3:formatName1Id::content']")
	private WebElement format;
	
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:AT3:inputText10::content']")
	private WebElement firstavailabledocnumber;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:AT3:inputText22::content']")
	private WebElement lastavailabledocnumber;
	
	@FindBy(xpath="//*[@id='pt1:r1:0:rt:1:r2:0:dynamicRegion1:0:pt1:SearchF:1:ap1:AT3:saveACBtn1']")
	private WebElement paymentdocokbtn;
	
	@FindBy(xpath="//*[text()='ave and Close']")
	private WebElement SaveandClose;
	
	@FindBy(xpath="//*[@id='d1::msgDlg::cancel']")
	private WebElement InformationOk;
	
	String xlpath="./TestData/InputData.xlsx";
	String sheetname="CreateBankAccount";
	
	public CreateBankAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void NavigatetoBankAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		String searchtask=Utility.GetCellValue(xlpath, sheetname, 1, 0);
		Click(userdropdown);
		Click(setupmaintainance);
		txtsearchtasks.sendKeys(searchtask);
		Click(searchicon);
		Click(managebankaccounts);
		Click(addicon);
	}
	public void Create_BankAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String branch=Utility.GetCellValue(xlpath, sheetname, 1, 1);
		String accname=Utility.GetCellValue(xlpath, sheetname, 1, 2);
		String accnumber=Utility.GetCellValue(xlpath, sheetname, 1, 3);
		String currencyvalue=Utility.GetCellValue(xlpath, sheetname, 1, 4);
		String entityname=Utility.GetCellValue(xlpath, sheetname, 1, 5);
		String entity=Utility.GetCellValue(xlpath, sheetname, 1, 6);
		String profitcentre=Utility.GetCellValue(xlpath, sheetname, 1, 7);
		String account=Utility.GetCellValue(xlpath, sheetname, 1, 8);
		
		bankbranch.sendKeys(branch);
		accountname.sendKeys(accname);
		accountnumber.sendKeys(accnumber);
		Select select= new Select(selectcurrency);
		select.selectByVisibleText(currencyvalue);
		legalentityname.sendKeys(entityname);
		payablescheckbox.click();
		receivablescheckbox.click();
		Thread.sleep(5000);
		cashsearch.click();
		Thread.sleep(6000);
		//llusentitydropdown.click();
		//llusentityvalue.click();
		llusentity.sendKeys(entity);
		llusprofitcentre.sendKeys(profitcentre);
		llusaccount.sendKeys(account);
		lluscostcentre.sendKeys("000");
		Thread.sleep(3000);
		costok.click();
		Thread.sleep(3000);
		String cashvalue=cash.getAttribute("value");
		Thread.sleep(3000);
		System.out.println("cashvalue is:"+cashvalue);
		cashclearing.sendKeys(cashvalue);
		
	}
	public void BusinessUnitAccess() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String busnsunit=Utility.GetCellValue(xlpath, sheetname, 1, 9);
		
		Thread.sleep(5000);
		businessunitaccess.click();
		businessunitcreateicon.click();
		businessunit.sendKeys(busnsunit);
		businessunitokbtn.click();
		
	}
	public void AddPaymentDocuments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String paymntdoc=Utility.GetCellValue(xlpath, sheetname, 1, 10);
		String formatvalue=Utility.GetCellValue(xlpath, sheetname, 1, 11);
		String firstnum=Utility.GetCellValue(xlpath, sheetname, 1, 12);
		String lastnum=Utility.GetCellValue(xlpath, sheetname, 1, 13);
		
		Thread.sleep(5000);
		general.click();
		Thread.sleep(3000);
		paymentdocumentaddicon.click();
		paymentdocument.sendKeys(paymntdoc);
		format.sendKeys(formatvalue);
		firstavailabledocnumber.sendKeys(firstnum);
		lastavailabledocnumber.sendKeys(lastnum);
		paymentdocokbtn.click();
	}
	public void Save_Validation() throws InterruptedException
	{
		Thread.sleep(5000);
		SaveandClose.click();
		Thread.sleep(3000);
		InformationOk.click();
	}
}

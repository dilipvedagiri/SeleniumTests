package pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import generics.Utility;

public class JournalCreationPage extends BasePage
{		
	@FindBy(xpath="//*[@id='pt1:_UIShome::icon']")
	private WebElement homePagelink;
	
	@FindBy(xpath="//*[@id='groupNode_general_accounting']")
	private WebElement generalaccounting;
	
	@FindBy(xpath="//*[@id='itemNode_general_accounting_journals']")
	private WebElement journals;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:_FOTsdi_JournalEntryPage_itemNode_FndTasksList::icon']")
	private WebElement tasks;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:_FOTRaT:0:RAtl2']")
	private WebElement createjournal;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:showLessJournalName::content']")
	private WebElement journal;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:showLessJournalDescription::content']")
	private WebElement description;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:LedgerName1::content']")
	private WebElement ledger;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:userJeCategoryNameId1::content']")
	private WebElement category;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:accountCS::content']")
	private WebElement debitbalance;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:EnteredDr::content']")
	private WebElement debit;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:0:it4::content']")
	private WebElement debitdescription;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3::db']/table/tbody/tr[2]/td[4]")
	private WebElement account;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:accountCS::content']")
	private WebElement creditbalance;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:EnteredCr::content']")
	private WebElement credit;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:jeLineAppTable:_ATp:t3:1:it4::content']")
	private WebElement creditdescription;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:1:pt1:ap1:saveBatch']/table/tbody/tr/td[1]")
	private WebElement savebtn;	
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:sdh1::_afrTtxt']/div")
	private WebElement journaltitle;	
	
	@FindBy(xpath="//*[text()='Complete']")
	private WebElement complete;
	
	@FindBy(xpath="//*[text()='C']/../..")
	private WebElement cancel;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:_FOTRaT:0:RAtl1']")
	private WebElement managejournals;	
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:queryP:value10::content']")
	private WebElement journalbatch;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:queryP::search']")
	private WebElement search;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_general_accounting_journals:0:MAnt2:2:pt1:ap1:AT1:_ATp:t1:0:commandLink3']")
	private WebElement journalinmanagejournal;
	
	@FindBy(xpath="//*[text()='Post']")
	private WebElement postjournal;
	
	String xlpath="./TestData/InputData.xlsx";
	String sheetname="JournalCreation";
	
	public JournalCreationPage(WebDriver driver)
	{
		super(driver);
	}
	//Navigate to Journal CReation Page
	public void NavigatetoCreateJournal() throws InterruptedException
	{
		Click(homePagelink);
		Click(generalaccounting);
		Click(journals);
		Click(tasks);
		Click(createjournal);
	}
	public void Create_Journal() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		String journalname=Utility.GetCellValue(xlpath, sheetname, 1, 0);
		String journaldesc=Utility.GetCellValue(xlpath, sheetname, 1, 1);
		String journalcategory=Utility.GetCellValue(xlpath, sheetname, 1, 2);
		String debitbalvalue=Utility.GetCellValue(xlpath, sheetname, 1, 3);
		String debitvalue=Utility.GetCellValue(xlpath, sheetname, 1, 4);
		String debitdescvalue=Utility.GetCellValue(xlpath, sheetname, 1, 5);
		String creditbalvalue=Utility.GetCellValue(xlpath, sheetname, 1, 6);
		String creditvalue=Utility.GetCellValue(xlpath, sheetname, 1, 7);
		String creditdescvalue=Utility.GetCellValue(xlpath, sheetname, 1, 8);
		
		
		
		journal.sendKeys(journalname);
		description.sendKeys(journaldesc);
		category.sendKeys(journalcategory);
		debitbalance.sendKeys(debitbalvalue);
		debit.sendKeys(debitvalue);
		debitdescription.sendKeys(debitdescvalue);
		Thread.sleep(3000);
		account.click();
		Thread.sleep(3000);
		creditbalance.sendKeys(creditbalvalue);
		credit.sendKeys(creditvalue);
		creditdescription.sendKeys(creditdescvalue);
		savebtn.click();
		Thread.sleep(3000);
		complete.click();
		cancel.click();
	}
	public void Manage_Journal() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String journalname=Utility.GetCellValue(xlpath, sheetname, 1, 0);
		Thread.sleep(5000);
		tasks.click();
		Thread.sleep(3000);
		managejournals.click();
		Thread.sleep(3000);
		journalbatch.sendKeys(journalname);
		search.click();
		journalinmanagejournal.click();
		postjournal.click();
	}
}

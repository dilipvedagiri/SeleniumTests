package pages;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import generics.Utility;

/**
 * @author dvedagiri
 *
 */
public class ManageAdjustmentPage extends BasePage
{		
	@FindBy(xpath="//*[@id='pt1:commandLink1']")
	private WebElement homePagelink;
	
	@FindBy(xpath="//*[@id='groupNode_receivables_2']")
	private WebElement receivables;
	
	@FindBy(xpath="//*[@id='itemNode_receivables_billing']")
	private WebElement receivablesbilling;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon']")
	private WebElement tasks;
	
	@FindBy(xpath="//*[text()='Manage Transactions']")
	private WebElement managetransaction;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:q1:value40::content']")
	private WebElement transactionnumber;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:q1::search']")
	private WebElement transactionsearch;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:0:ap1:AT2:_ATp:table2:0:cl1']")
	private WebElement transactionnumberlink;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:m1']/div/table/tbody/tr/td[2]/a")
	private WebElement actions;
	
	@FindBy(xpath="//*[text()='Manage Adjustments']")
	private WebElement manageadjustments;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:1:ap1:AT1:_ATp:create::icon']")
	private WebElement manageadjustmentsaddicon;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:1:ap1:AT1:actvty::content']")
	private WebElement receivablesactivity;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:1:ap1:AT1:selectOneChoice1::content']")
	private WebElement adjustmenttype;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:1:ap1:AT1:amountId::content']")
	private WebElement adjustmentamount;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:1:ap1:AT1:selectOneChoice2::content']")
	private WebElement adjustmentreason;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:1:ap1:AT1:saveBtn1']")
	private WebElement submitbtn;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:0:ap110:cmi6']/td[2]")
	private WebElement viewbalancedetails;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:MTF1:1:pt1:Trans1:1:ap1:activeCommandToolbarButton1']/a")
	private WebElement donebtn;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:orgNameId::content']")
	private WebElement businessunit;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:batchSourceId::content']")
	private WebElement transactionsource;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:transactionTypeId::content']")
	private WebElement transactiontype;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:billToNameId::content']")
	private WebElement billtoname;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:paymentTermId::content']")
	private WebElement paymentterms;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:descriptionId::content']")
	private WebElement invoicedesc;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:quantity::content']")
	private WebElement quantity;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:1:pt1:TCF:0:ap1:AT1:_ATp:table1:0:sellingPrice::content']")
	private WebElement unitprice;
	
	@FindBy(xpath="//*[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:2:pt1:Trans1:0:ap110:newTrx::popEl']")
	private WebElement dropdownmenu;

	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:2:pt1:Trans1:0:ap110:reviewBTN']/td[2]")
	private WebElement completeandreview;
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:MAnt2:2:pt1:Trans1:0:ap110:cl3']")
	private WebElement statusmessage;
	
	String xlpath="./TestData/InputData.xlsx";
	String sheetname="ManageAdjustment";
	
	
	public ManageAdjustmentPage(WebDriver driver)
	{
		super(driver);
	}

	public void NavigatetoManageTransaction() throws InterruptedException
	{
		Click(homePagelink);
		Click(receivables);
		Click(receivablesbilling);
		Click(tasks);
		Click(managetransaction);
	}
	public void Manage_Adjustment() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		String txnumber=Utility.GetCellValue(xlpath, sheetname, 1, 0);
		transactionnumber.sendKeys(txnumber);
		Click(transactionsearch);
		Click(transactionnumberlink);
		actions.click();
		manageadjustments.click();
	}
	public void Add_ManageAdjustments() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Click(manageadjustmentsaddicon);
		Thread.sleep(5000);
		String rxactivity=Utility.GetCellValue(xlpath, sheetname, 1, 1);
		String adjvalue=Utility.GetCellValue(xlpath, sheetname, 1, 2);
		String adjamount=Utility.GetCellValue(xlpath, sheetname, 1, 3);
		String reason=Utility.GetCellValue(xlpath, sheetname, 1, 4);
		
		receivablesactivity.sendKeys(rxactivity);
		Select selecttype= new Select(adjustmenttype);
		selecttype.selectByVisibleText(adjvalue);
		adjustmentamount.sendKeys(adjamount);
		SelectByVisibleText(adjustmentreason, reason);
		submitbtn.click();
		Click(donebtn);	
	}
	public void View_Balance() throws InterruptedException
	{
		actions.click();
		Click(viewbalancedetails);
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import generics.Utility;

public class Receivables extends BasePage
{
		
	@FindBy(xpath="//*[@id='pt1:commandLink1']")
	private WebElement homePagelink;
	
	@FindBy(xpath="//*[@id='groupNode_receivables_2']")
	private WebElement receivables;
	
	@FindBy(xpath="//*[@id='itemNode_receivables_billing']")
	private WebElement receivablesbilling;
	
	
	@FindBy(xpath="//*[@id='pt1:_FOr1:1:_FOSritemNode_receivables_billing:0:_FOTsdi__TransactionsWorkArea_itemNode__FndTasksList::icon']")
	private WebElement tasks;
	
	@FindBy(xpath="//*[text()='Create Transaction']")
	private WebElement createtransaction;
	
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
	String sheetname="Receivables";
	
	
	public Receivables(WebDriver driver)
	{
		super(driver);
	}
	public void CreateReceivables() throws InterruptedException
	{
		homePagelink.click();
		Click(receivables);
		Click(receivablesbilling);
		Click(tasks);
		Click(createtransaction);
	}
	public void Create_Invoice() throws  Exception
	{
		String businessunitname=Utility.GetCellValue(xlpath, sheetname, 1, 0);
		String txsourcename=Utility.GetCellValue(xlpath, sheetname, 1, 1);
		String txtype=Utility.GetCellValue(xlpath, sheetname, 1, 2);
		String billtonamevalue=Utility.GetCellValue(xlpath, sheetname, 1, 3);
		String paymenttermsname=Utility.GetCellValue(xlpath, sheetname, 1, 4);
		String invoicedescvalue=Utility.GetCellValue(xlpath, sheetname, 1, 5);
		String quantityvalue=Utility.GetCellValue(xlpath, sheetname, 1, 6);
		String unitpricevalue=Utility.GetCellValue(xlpath, sheetname, 1, 7);
		
		SendKeys(businessunit, businessunitname);
		SendKeys(transactionsource, txsourcename);
		SendKeys(transactiontype, txtype);
		SendKeys(billtoname, billtonamevalue);
		SendKeys(billtoname, billtonamevalue);
		SendKeys(paymentterms, paymenttermsname);
		SendKeys(invoicedesc, invoicedescvalue);
		SendKeys(quantity, quantityvalue);
		SendKeys(unitprice, unitpricevalue);
		
	
/*		businessunit.sendKeys(businessunitname);
		transactionsource.sendKeys(txsourcename);
		transactiontype.sendKeys(txtype);
		billtoname.sendKeys(billtonamevalue);
		paymentterms.sendKeys(paymenttermsname);
		invoicedesc.sendKeys(invoicedescvalue);
		quantity.sendKeys(quantityvalue);
		unitprice.sendKeys(unitpricevalue);*/
		save.click();
		Thread.sleep(5000);
		dropdownmenu.click();
		Thread.sleep(5000);
		completeandreview.click();
		String expmsg = statusmessage.getText();
		Assert.assertEquals("Complete", expmsg);
	}
}

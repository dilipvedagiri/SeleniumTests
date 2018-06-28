package generics;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility 
{	
	public static int GetRowCount(String filepath,String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc=sheet.getLastRowNum();
		return rc;
	}
	public static int GetCellCount(String filepath,String sheetname,int r) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int cc=sheet.getRow(r).getLastCellNum();
		return cc;
	}
	public static String GetCellValue(String filepath,String sheetname,int r,int c) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(sheetname);
		String value = sheet.getRow(r).getCell(c).toString();
		System.out.println("Value is:"+value);
		return value;	
	}
	
	public static Object[][] ReadExceldata(String filepath,String sheetname) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(sheetname);
		int rc=sheet.getLastRowNum();
		System.out.println("Row Count is"+rc);
		int c=GetCellCount(filepath, sheetname, 1);
		Object[][] data= null;
		int ci=0;
		int cj=0;
		for(int i=1;i<=rc;i++,ci++) 
		{
			System.out.println("Iteration of i is:"+i);
			int cc=sheet.getRow(i).getLastCellNum();
			System.out.println("Column Count is"+c);
			data= new Object[rc][cc];
			for(int j=0;j<cc;j++,cj++)
			{
				System.out.println("Iteration of j is:"+j);
				data[ci][cj] = sheet.getRow(i).getCell(j).toString();
				System.out.print("Value of data["+i+"]["+j+"]  is:"+data[i][j]);
			}
			System.out.println();
		}
		return data;	
	}
	
	
}

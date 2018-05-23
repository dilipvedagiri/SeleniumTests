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
	public static String GetCellValue(String filepath,String sheetname,int r,int c) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream(filepath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet(sheetname);
		String value = sheet.getRow(r).getCell(c).toString();
		return value;	
	}
	
}

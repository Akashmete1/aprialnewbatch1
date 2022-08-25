package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo3 
{
public static void main(String[] args) throws EncryptedDocumentException, IOException 
{

	FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\Documents\\ScreenRecorder\\Automation testing.xlsx");
	
	
	Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
	   String Demo1 = sheet.getRow(0).getCell(0).getStringCellValue();
	   double Demo3 = sheet.getRow(0).getCell(1).getNumericCellValue();
	   	
	   System.out.println("string value1="+Demo1);
	   System.out.println("string value3="+Demo3);
	   
	   
}
	
	
	
	
	
	
}


package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	
	{
		FileInputStream File=new FileInputStream("C:\\Users\\lenovo\\Documents\\ScreenRecorder\\Facebook.xlsx");
		
		Sheet sheet = WorkbookFactory.create(File).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1899);
		
		
	WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
	String un1 = sheet.getRow(0).getCell(0).getStringCellValue();
	
     UN.sendKeys(un1);
     WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
     
     String pass1 = sheet.getRow(0).getCell(1).getStringCellValue();
     pass.sendKeys(pass1);
     
 	
		Thread.sleep(1899);
		
		
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	driver.quit();
		
	



		
		
		
		
		
	}
	
	
	
	
	
}

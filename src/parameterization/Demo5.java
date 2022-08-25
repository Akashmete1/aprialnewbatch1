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

public class Demo5 
{
public static void main (String[]args) throws EncryptedDocumentException, IOException, InterruptedException
{
	
	FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\Documents\\ScreenRecorder\\book1.xlsx");
	
	Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	
	Thread.sleep(2000);
	
	  WebElement name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
	    String un1 = sheet.getRow(0).getCell(0).getStringCellValue();
	    Thread.sleep(2000);
	name.sendKeys(un1);
	
	Thread.sleep(2000);
//	WebElement Mob = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
	
	// mob1 = sheet.getRow(1).getCell(0).getStringCellValue();
	
	//Mob.sendKeys(mob1);
	Thread.sleep(2000);
   WebElement mail = driver.findElement(By.xpath("//input[@id='ap_email']"));
	
	String mail1 = sheet.getRow(2).getCell(0).getStringCellValue();
	
	mail.sendKeys(mail1);
	
	Thread.sleep(2000);
	driver.close();
	
}
	
	
	
	
	
}

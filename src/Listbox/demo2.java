package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	 Thread.sleep(1569);
	 
	 
	 driver.findElement(By.xpath("//a[text( )='Create New Account']")).click();
	 Thread.sleep(1569);
	 
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Thread.sleep(1569);
	System.out.println(month.getSize());
	
	Select a = new Select(month);
	
	Thread.sleep(1569);
	a.selectByIndex(5);
	
	Thread.sleep(1569);
	 
	driver.quit();
	
	 
		
		
		
		
		
		
	}
	
	
	
}

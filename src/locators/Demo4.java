package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 
{
public static void main(String[] args) throws InterruptedException 
{
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	//1. get =>it is use to pass URL
	
   driver.get("https://www.facebook.com/");
   
   driver.manage().window().maximize();
   
   Thread.sleep(1459);
   
   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("4569");
   
   Thread.sleep(1459);
   
   WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
   

   
   pass.sendKeys("369");
   
   Thread.sleep(1459);
   
   driver.findElement(By.xpath("//button[@name='login']")).click()   ;
   
   Thread.sleep(1459);
   
   driver.quit();
   
   
   
   
   
   
   
   
   
			
			
	
	
}
	
	
	
	
	
	
	
	
	
}

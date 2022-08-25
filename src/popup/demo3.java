package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 
{
public static void main(String[] args) throws InterruptedException
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	
	WebElement un = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	WebElement pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	un.sendKeys("9284946860");
	pass.sendKeys("hbsbhs");
	
	Thread.sleep(1988);
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	Thread.sleep(1988);
	
	driver.quit();
	
	
	
	
	
}
	
	
	
	
}

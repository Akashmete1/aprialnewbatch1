package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{

public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	Thread.sleep(1899);
	
	WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	
	driver.switchTo().frame(iframe);
	
	WebElement frame = driver.findElement(By.xpath("//button[contains(text(),'Click me to display ')]"));
	
	Thread.sleep(1899);
	frame.click();
	
		
		
		
}	
	
	
	
}

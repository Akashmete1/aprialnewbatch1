package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		
		Thread.sleep(1555);
		
		WebElement UN = driver.findElement(By.id("email"));
		
		
		WebElement Click = driver.findElement(By.xpath("//button"));
		
		
		//Sendkeys=this method use to send value in the i/p field
		
		
		UN.sendKeys("JBHJDFVBHDFVBH");
		
		// Clear=this method is use clease value in the text filed
		
		Thread.sleep(1569);
		
		UN.clear();
		
		//click = this method is to click button or icon.
		
		Thread.sleep(1569);
	
		
	//Click.click();	
	
	//is enable= this method is use to verify the element is enable or disable  return type boolean
	
		boolean un1 = UN.isEnabled();
		
		boolean btn = Click.isEnabled();
		
		
		System.out.println(un1);
		System.out.println(btn);
		
		
		
		
		
		
		
		
	}
	
	
	
}

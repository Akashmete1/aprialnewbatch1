package multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 
{

public static void main(String[] args) throws InterruptedException

{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("C:/Users/lenovo/Downloads/checkbox.html");
	
	driver.manage().window().maximize();
	
	//WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	System.out.println(checkbox.size());
	
	for(WebElement op:checkbox)
	{
		Thread.sleep(1899);
		
		op.click();
		
	}
	
	for(WebElement op:checkbox)
	{
		Thread.sleep(1000);
		op.click();
		
	}
	
	driver.quit();
	

	
	
	
}	
	
	
	
	
}

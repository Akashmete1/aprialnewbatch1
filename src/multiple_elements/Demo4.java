package multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4

{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("C:/Users/lenovo/Downloads/checkbox.html");
		
		
		driver.manage().window().maximize();
		
	          List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(checkbox.size());
		
		for(int i=checkbox.size()-1;i>=0 ; i--)
		{

			 WebElement check = checkbox.get(i);
			 check.click();
			 
			 Thread.sleep(1899);
			 
		
			 
		}
		
		driver.quit();
		
		
		
		
	}
	
	
	
}

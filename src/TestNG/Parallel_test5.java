package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_test5
{


	@Test
	public void openbrower5() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nike.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.close();	
	}
}

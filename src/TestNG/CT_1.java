package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CT_1 

{
	
	@Parameters("BrowserName")
	@Test
	public void test(String BrowserName) throws InterruptedException
	{
		
		
	
		WebDriver driver=null;
		
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Documents\\chromedriver.exe");
			driver =new ChromeDriver();
			
		}
		else if(BrowserName.equals("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\lenovo\\Desktop\\geckodriver.exe");
			
			
			driver= new FirefoxDriver();
			
			
		}
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		Thread.sleep(2000);
		driver.get("http://www.facebook.com/");
		String actual = driver.findElement(By.xpath("//a[text()='Create New Account']")).getText();

		
		SoftAssert soft =new SoftAssert();
		String Expected="Create New Account";
		
		soft.assertEquals(actual, Expected,"Test case 001 is fail");
		soft.assertAll();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
	}
	
}

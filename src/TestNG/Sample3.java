package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample3
{
	
	public String expResult;
	
	public WebDriver driver;
@BeforeClass
public void openbrowers()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}
@BeforeMethod
public void login()
{
	
	driver.get("https://www.Flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	
}

@Test
public void test()
{
       WebElement actresult = driver.findElement(By.xpath("//span[@class='z3ht-w']"));
       
       String act = actresult.getText();
       expResult="© 2007-2022 Flipkart.com";
       
      // Assert.assertEquals(act, expResult);
       
       if(act.equals(expResult))
       {
    	   Reporter.log("Test case is pass", true);
    	   
    	   
       }
       
       else
       {
    	   Reporter.log("Test case is fail", true);
       }
}
@AfterMethod
public void logout()
{
	driver.navigate().refresh();
	
}
@AfterClass
public void quite()
{
	
	driver.close();
}



}

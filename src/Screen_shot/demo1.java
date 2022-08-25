package Screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo1


{

	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1589);
		
     File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
     
		

     File dest=new File("C:\\Users\\lenovo\\Desktop\\New folder\\facebook_signin.jpg");
		
		
		FileHandler.copy(Source, dest);
		
		driver.quit();
	
	
}
	
	
}
	
	
	

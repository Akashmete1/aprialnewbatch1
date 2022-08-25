package Screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo2 
{

	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Documents\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		
		
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(1569);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\lenovo\\Documents\\ScreenRecorder\\nhhbc");
		FileHandler.copy(source, dest);
		
		
		driver.quit();
		
	}
	
	
	
}

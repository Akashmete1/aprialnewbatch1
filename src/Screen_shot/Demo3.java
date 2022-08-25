package Screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Demo3 
{

	
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		
		
		
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1569);
		
	String Abc = RandomString.make(5);
		
	
	
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("C:\\Users\\lenovo\\Documents\\ScreenRecorder\\xyz"+Abc+".jpg");
		
		
		FileHandler.copy(source, Dest);
		
		driver.quit();
		
			
}
}
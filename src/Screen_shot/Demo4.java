package Screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Demo4 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
	
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String abc = RandomString.make(4);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\lenovo\\Desktop\\New folder\\amazon"+abc+".jpg");
		
		FileHandler.copy(source, dest);
		
		Thread.sleep(1899);
		
		
		driver.quit();
		
		
	
		
		
	}
	
	
	
}


package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
	
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Thread.sleep(1988);
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(1988);
		
		driver.quit();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

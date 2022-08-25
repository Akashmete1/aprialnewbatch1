package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
	
		
		
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> window = new ArrayList<String>(id);
		
		String Homepage = window.get(0);
		String Newtab = window.get(1);
		
		Thread.sleep(1899);
		
		driver.switchTo().window(Newtab);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		
		
		
		driver.switchTo().window(Homepage);
		
		
		driver.findElement(By.xpath("(//input[@class='btn'])[1]")).click();
	
		Thread.sleep(1899);
		
		driver.quit();
		
	
		
		
	}
	
	
	
	
	
}

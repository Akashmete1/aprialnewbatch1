package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_demo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();

			driver.get("https://skpatro.github.io/demo/links/");


		
		
		driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();
		Thread.sleep(2000);
		
		Set<String> id = driver.getWindowHandles();
		
		ArrayList<String> webpage = new ArrayList<String>(id);
		
		String FirstWebPage = webpage.get(0);
				
		String SecondWebPage = webpage.get(1);
		
		System.out.println(FirstWebPage);
		System.out.println(SecondWebPage);
		
		
		driver.switchTo().window(SecondWebPage);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(1899);
		
		driver.quit();
		
		
		
		
	}
	
	
	
}

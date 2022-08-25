package multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{
public static void main(String[] args) 
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	
	//WebElement links  = driver.findElement(By.xpath("//a"));
	
	
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	
	
	int Size = links.size();
	

	System.out.println(Size);
	
	

	
}
	
	
	
}

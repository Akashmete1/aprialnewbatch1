package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{
	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/alerts");

	
	driver.findElement(By.xpath("//button[@id='confirmButton']"));
	
	Thread.sleep(1899);
	
	Alert alt = driver.switchTo().alert();
	
	String text = alt.getText();
	
	alt.accept();
	
	
//		alt.dismiss();
	
	
	System.out.println(text);
	
			
	
	}
	
	
	

}

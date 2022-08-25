
package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{

public static void main(String[] args) throws InterruptedException 
{

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Documents\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");



      WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
      
      Thread.sleep(1899);
      
      WebElement frame = driver.findElement(By.xpath("//button[contains (text(),'Click me to display Date and Time.')]"));
      
      Thread.sleep(1899);
      frame.click();
      
   driver.switchTo().defaultContent();
   
   
    driver.findElement(By.xpath("//a[@id='tryhome']")).click();
    
	
}	
	
	
}

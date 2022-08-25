package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browserpopup2 
{
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();

		driver.get("https://skpatro.github.io/demo/links/");

	
driver.findElement(By.xpath("(//input[@class='btn'])[2]")).click();

Thread.sleep(2000);

Set<String> id = driver.getWindowHandles();


        //    ArrayList<String> Webpageid = new ArrayList<String>(id);
            
ArrayList<String> Webpageid=new ArrayList<String>(id);
//ArrayList<String> Webpageid1=new ArrayList<String>(id);

           
        String FirstWebpage= Webpageid.get(0);
         String SecondWebpage= Webpageid.get(1);


           System.out.println(FirstWebpage);
           System.out.println(SecondWebpage);
           
           driver.switchTo().window(SecondWebpage);
           
           driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
           Thread.sleep(2000);
   		
   		driver.quit();
           
	
	
	}

}

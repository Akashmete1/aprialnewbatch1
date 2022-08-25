package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3
{

public static void main(String[] args) throws InterruptedException 
{

	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();

     driver.get("https://www.amazon.in");
	
 //	driver.navigate().to("https://www.flipkart.com/");
	
     
   //  driver.close();
     
     
     //*Get title => use to get title of current web page
     String title = driver.getTitle();
     
     System.out.println(title);
     
     
     //*Get current url=> use to get current url of the page
     String url = driver.getCurrentUrl();
     System.out.println(url);
     
     
     // maxmise=>use to maximize the size of browser
     
   driver.manage().window().maximize();
     
   //Navigate = 1. forward 2. backword 3 refresh
   
   Thread.sleep(1500);
   
   driver.navigate().refresh();
   
   driver.navigate().back();
   
   Thread.sleep(1500);
   
 //  Quite=>use to close the browser
   
  driver.quit();
   
   
  driver.navigate().forward();
     
}	
	
	
	
	
	
}

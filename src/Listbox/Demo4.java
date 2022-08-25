package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demo4
{

	public static void main(String[] args) throws InterruptedException
	{
	
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1988);
		
		
		driver.findElement(By.xpath("//a[text( )='Create New Account']")).click();
		
		Thread.sleep(1988);
		
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Thread.sleep(1988);
		
		Select S1=new Select (day);
        Select S2=new Select (month);
	
       Select S3=new Select (year);	
       

       S1.selectByValue("15");
   	Thread.sleep(1988);

       S2.selectByVisibleText("Aug");
   	Thread.sleep(1988);

        S3.selectByValue("1947");

        Thread.sleep(1988);
        
        boolean v1 = S1.isMultiple();

        boolean v2 = S2.isMultiple();	

        boolean v3 = S1.isMultiple();
		
        
        System.out.println("box1="+v1);
        System.out.println("box2="+v2);
        System.out.println("box3="+v3);
        
		

	
	
	}
}

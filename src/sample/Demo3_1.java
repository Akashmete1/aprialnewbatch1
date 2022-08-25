package sample;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3_1 
{
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\lenovo\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		//  Set Size => use to change the size of the browser 
		
	Dimension d=new Dimension(15,31);
		driver.manage().window().setSize(d);
		
		//Set Position=> use to set the position

		Point P=new Point(65,89);
		driver.manage().window().setPosition(P);
		
	}

}

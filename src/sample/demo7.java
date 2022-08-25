package sample;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 
{
	public static void main(String[] args) throws InterruptedException
	{
	
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	Thread.sleep(2000);
	
		
		String title = driver.getTitle();
		Thread.sleep(2000);
		
		System.out.println(title);
		Thread.sleep(2000);
		
		String url = driver.getCurrentUrl();
		Thread.sleep(2000);
		
		System.out.println(url);
	
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	Dimension D= new Dimension(200,300);  //set size method.
	
	driver.manage().window().setSize(D);
	Point P=new Point(300,200);  // set position
	
	driver.manage().window().setPosition(P);
	
	
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
	
		
		
		
	}
	

}

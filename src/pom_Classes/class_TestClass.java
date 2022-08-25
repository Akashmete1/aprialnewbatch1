package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_TestClass
{

	public static void main(String[] args) throws InterruptedException 
	{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
Facebook_login_page login =new Facebook_login_page(driver);
		
		Thread.sleep(2000);
		
		login.setUN();
		
		Thread.sleep(1000);
		
		login.setpass();
		
		Thread.sleep(1000);
		
		login.clickoncreateaccount();
		Thread.sleep(1000);
	
		FacebookSignupPage Signup=new FacebookSignupPage(driver);
		Signup.SetFName();
		
		Thread.sleep(1000);
		
		Signup.setLName();
		Thread.sleep(1000);
		driver.quit()
		;
		
		
	
		
		
	}
	
	
	
}

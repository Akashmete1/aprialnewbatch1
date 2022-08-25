package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo6 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		
		
		
		driver.get("https://testpages.herokuapp.com/basic_html_form.html");
		
		driver.manage().window().maximize();
		
		
	WebElement Multipleselescted_listbox = driver.findElement(By.xpath("//select[@name='multipleselect[]']"));
		
		
		Thread.sleep(1988);
		
		Select S= new Select(Multipleselescted_listbox);
		S.selectByIndex(1);
		
		Thread.sleep(1988);
		S.selectByIndex(0);
		
		Thread.sleep(1988);
		
		S.selectByIndex(2);
		
		Thread.sleep(1988);
		
		WebElement first_option = S.getFirstSelectedOption();
		
		System.out.println(first_option.getText());
		

		Thread.sleep(1988);
		
		
		
		driver.quit();
		
		
		
	}
	
	
	
	
	
}

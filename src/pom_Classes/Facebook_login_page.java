package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author lenovo
 *
 */
public class Facebook_login_page 

{
	//Step 1  Declare D.M Globally With an access level private 
	
	@FindBy(xpath="//input[@id='email']")private WebElement UN;
	@FindBy(xpath="//input[@id='pass']") private WebElement pass;
	
	@FindBy(xpath="//button[@name='login']") private WebElement btn;
	@FindBy(xpath="//a[text()='Create New Account']") private WebElement createaccount;
	
	

	//Step 2 Initialize within constructor with access level public
	
	
	public Facebook_login_page(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	//Step 3 Utilize within a method with access level public 
	public void setUN()
	{
		
		UN.sendKeys("HBVDHB");
		
	}
	public void setpass()
	{
		pass.sendKeys("ndbnsbn");
		
	}
	
	
	public void Clickbtn()
	{
		btn.click();
	}
	 
	public void clickoncreateaccount()
	{
		
		createaccount.click();
	}
	
	
	
}

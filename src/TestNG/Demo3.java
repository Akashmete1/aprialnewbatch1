package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 
{

	@Test
	public void Test2()
	{
		
		Reporter.log("Test 2 is pass",true);
	}
	
	@BeforeClass
	public void main()
	{
		
		Reporter.log("KFJNFKDHNFVJ", true);
		
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("We enter valid credential & sucessfully login to s/w", true);
		
	}
	
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("Logout from s/w",true);
		
	}
	
	@Test
	
	public void release()
	{
		
		Reporter.log("test case release ", true);
	}
	
@Test
	
	public void release1()
	{
		
		Reporter.log("test case release1 ", true);
	}
	
}

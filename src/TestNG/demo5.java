package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo5 
{

	
	@Test(enabled=false)
	public void test1()
	{
		
		Reporter.log("test1 is running",true);
		
		
	}
	
	@Test(enabled=false)
	public void test2()
	{
		
		Reporter.log("test2 is running",true);
		
		
	}
	@Test(priority=7)
	public void test3()
	{
		
		Reporter.log("test3 is running",true);
		
		
	}
	
	@Test
	public void test4()
	{
		
		Reporter.log("test4 is running",true);
		
		
	}
	@Test(timeOut=1856) 
	public void test5() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("test6 is running",true);
		
		
	}
	@Test(dependsOnMethods= {"test1","test5","test3"})
	public void test7()
	{
		
		Reporter.log("test7 is running",true);
		
		
	}
	
	

}

package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo4 
{

	
	
	@Test(invocationCount=89,priority=5)
	public void test1()
	{
		
		Reporter.log("test1 is running",true);
		
		
	}
	
	@Test(priority=-1)
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
	@Test(priority=6)
	public void test5()
	{
		
		Reporter.log("test6 is running",true);
		
		
	}
	@Test(priority=3)
	public void test7()
	{
		
		Reporter.log("test7 is running",true);
		
		
	}
	
	
}

package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo8 
{
	public class demo7 
	{
		@Test(groups="Login")
		public void test1()
		{
			
			Reporter.log("Test 1 is pass",true);
		}
		
		@Test(groups="Login")
		public void test2()
		{
			//Assert.fail("Test 2 is fail");
			
			Reporter.log("Test 2 is pass",true);
		}
		
		@Test(groups="Home")
		public void test3()
		{
			//Assert.fail("Test 3 is fail");
			Reporter.log("Test 3 is pass",true);
		}
		
		@Test(groups="pay")
		public void test4()
		{
			
			Reporter.log("Test 4 is pass",true);
		}
		
		@Test(groups="Home")
		public void test5()
		{
			
		//	Assert.fail("Test 5 is fail");
			Reporter.log("Test 5 is pass",true);
		}
		
		@Test(groups="pay")
		public void test6()
		{
			
			Reporter.log("Test 6 is pass",true);
		}
		
		@Test(groups="pay")
		public void test7()
		{
			
			Reporter.log("Test 7 is pass",true);
		}
		
		
		
	}

	
	
	
}

package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo9 
{
	public class demo7 
	{
		@Test(groups="pay")
		public void test9()
		{
			
			Reporter.log("Test 9 is pass",true);
		}
		
		@Test(groups="pay")
		public void test10()
		{
			//Assert.fail("Test 2 is fail");
			
			Reporter.log("Test 10 is pass",true);
		}
		
		@Test(groups="Login")
		public void test11()
		{
			//Assert.fail("Test 3 is fail");
			Reporter.log("Test11 is pass",true);
		}
		
		@Test(groups="Home")
		public void test12()
		{
			
			Reporter.log("Test 12 is pass",true);
		}
		
		@Test(groups="Home")
		public void test13()
		{
			
		//	Assert.fail("Test 5 is fail");
			Reporter.log("Test13 is pass",true);
		}
		
		@Test(groups="Login")
		public void test14()
		{
			
			Reporter.log("Test14 is pass",true);
		}
		
		@Test(groups="Login")
		public void test15()
		{
			
			Reporter.log("Test 15 is pass",true);
		}
		
		
		
	}

}

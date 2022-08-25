package TestNG;

import static org.testng.Assert.assertNotEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifications 
{

	@Test
	public void test1()
	{
		
	//	String act="Akash";
	//	String exp="Akash";	
		
		
	//	Assert.assertEquals(act, exp,"act & exp values are not matching");
		
		
	//	System.out.println("Test 1 is pass");
		
		

		//	String act="Akash";
		//	String exp="Aksh";	
		
		
		//	Assert.assertNotEquals(act, exp,"act & exp values are not matching");
		
		
		//System.out.println("Test 1 is pass");
		
		
		boolean login=false;
		Assert.assertFalse(login, "result is not true");
		
		
		
		
	}
	
	
	
}

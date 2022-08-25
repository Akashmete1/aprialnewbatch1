package TestNG;


import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class demo6 
{

	@Test
		public static void test () 
	{
	 String str = "Akash";
	 
		String str1 = "Aakash";
		
        SoftAssert soft = new SoftAssert();
		
        soft.assertEquals(str, str1,"act & exp are not matching");
        
        Reporter.log("fail",true);
        
        soft.assertAll();
		
	}
	
}

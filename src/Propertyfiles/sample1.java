package Propertyfiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class sample1
{

	public static void main(String[] args) throws IOException 
	{
		
	
	
	Properties obj= new Properties();
	FileInputStream openbrowser=new FileInputStream("C:\\Users\\lenovo\\eclipse-workspace\\Aprilbatch1\\Property files\\April.properties");
	
	
	obj.load(openbrowser);
	
	String Property = obj.getProperty("akash");
	System.out.println(Property);
	
	
	
	
	}
	
	
	
	
	
}

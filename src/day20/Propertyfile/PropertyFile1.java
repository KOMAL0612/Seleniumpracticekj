package day20.Propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile1{

	public static void main(String[] args) throws IOException  {
		
		
		String filePath1=new String("E:\\ACCELARATION\\workspace\\Corejavabasicmec\\Propertyfiles\\AppData.properties");
		
		String currentDir=System.getProperty("user.dir");
		String filePath2 =new String(currentDir+"\\PropertyFiles\\AppData.properties");
				//or
		String filePath3 =new String(".\\PropertyFiles\\AppData.properties");
		
		//Create an instance of FileInputStream class by passing file location to its constructor
		FileInputStream fis=new FileInputStream(filePath2);
		
		//Create an instance of Properties class 
		Properties prop=new Properties();
		
		//with the help of Properties class ref call load() and pass FileInputStream ref as a parameter
		prop.load(fis);

		//in order to read data from property file use getProperty(String key) of Properties class
		System.out.println("Application URL: "+prop.getProperty("applicationURL"));
		System.out.println("Username: "+prop.getProperty("username"));
		System.out.println("Password: "+prop.getProperty("password"));
		
	}

}
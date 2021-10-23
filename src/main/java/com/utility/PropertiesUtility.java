package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
	
	//1 utilty  need--read property file
		//2 whats r inputs-- key
		//3 what will be output-- value

	public static FileInputStream fis=null;
	//public static  Properties prop=null;

	public static String readProperty(String key)
	{
		Properties prop=new Properties();
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"src/main/resources/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(prop.getProperty(key)!=null)
			return prop.getProperty(key);
		else
			return "Property value not found for "+key;
	}





}


package com.framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 *
 * @author SHIVA
 *created on 16th Dec,2017
 */


public class GetPropertyValue {
	
	static final String filepath="D:\\Mars_workspace\\Framework\\Config.properties";
	/**
	 * @description read value from properties on the basis of key
	 * @param key
	 * @return String
	 */
	
	public static String getvalue(String key)
	{
		String value=null;
		
		Properties prop =new Properties();
		try {
			prop.load(new FileInputStream(new File(filepath)));
			value=prop.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
		
		
	}
	
	
	
	
	
	
	
	
	

}

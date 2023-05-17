package testproperties.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static String readPropertyFile(String filePath, String key) {
		Properties properties = new Properties();
		File file = new File(filePath);
		FileInputStream fileInputStream;
		String value = "";
		try {
			fileInputStream = new FileInputStream(file);
			properties.load(fileInputStream);
			value =properties.getProperty(key);
			System.out.println("Value of Key :" +value);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
	public static void main(String[] args) {
		
		String url =readPropertyFile("Java/test.properties", "url");
		String username =readPropertyFile("Java/test.properties", "username");
		String password =readPropertyFile("Java/test.properties", "password");
		
		

	}

}

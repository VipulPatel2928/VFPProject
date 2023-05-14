package testproperties.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteInToPropertyFile {
	
	public static void writeInToPropertyFile(String filePath, String key, String value) {
		Properties properties = new Properties();
		File file = new File(filePath);
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(file);
			properties.load(fileInputStream);
			FileOutputStream fileOutputStream = new FileOutputStream(file);
			properties.setProperty(key, value);
			properties.store(fileOutputStream, "This is username, we can use it for login");
			System.out.println("Property file is updated");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}} //end of writeInToPropertyFile

	public static void main(String[] args) {
		
		writeInToPropertyFile("Java/test.properties", "password", "java@123");
		

	}

}

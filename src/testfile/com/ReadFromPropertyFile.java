package testfile.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertyFile {

	public static String readFromPropertyFile(String fileName,String key) throws IOException {
		
		File file = new File("java/"+fileName);
		Properties p = new Properties();
		FileInputStream fileInputStream = new FileInputStream(file);
		p.load(fileInputStream);
		return p.getProperty(key);
	}
	
	public static void main(String[] args) throws IOException {
		String valueString =ReadFromPropertyFile.readFromPropertyFile("test.properties","password");
		System.out.println(valueString);	
	}
}

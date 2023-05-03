package testfile.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteintoPropertyFile {

	public static void writeIntoPropertyFile(String fileName) throws IOException {
		
		File file = new File("java/"+fileName);
		Properties p = new Properties();
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		p.load(fileInputStream);
		
		p.setProperty("TestEnvironment", "Production");
		
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		p.store(fileOutputStream, "");
	}
	
	public static void main(String[] args) throws IOException {
		
		WriteintoPropertyFile.writeIntoPropertyFile("test.properties");
		
	}
}

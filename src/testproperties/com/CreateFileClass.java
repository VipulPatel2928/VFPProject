package testproperties.com;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class CreateFileClass {
	public static void createFile(String filename) throws IOException {
		File file = new File("Java/"+filename);
		if(file.createNewFile()) {
			System.out.println("File is successfully created");
		}
		else {
			System.out.println("File is not created successfully");
		}
	}

	public static void main(String[] args) throws IOException {
		CreateFileClass.createFile("test.properties");
	}
}

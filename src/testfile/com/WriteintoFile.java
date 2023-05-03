package testfile.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class WriteintoFile {
	
	public static void writeintoFile(String fileName, String fileData) throws IOException {
		File file = new File("java/"+fileName);
		FileWriter fWriter = new FileWriter(file,true);
		fWriter.write(fileData);
		fWriter.write("\n");
		fWriter.flush();
		fWriter.close();
	}

	public static void main(String[] args) throws IOException {
		
		WriteintoFile.writeintoFile("test.txt", "password123");

	}

}

package test.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Test {
	public static void createDirectory(String dirName) {
		String currentPath = System.getProperty("user.dir");
		System.out.println(currentPath);
		String path = currentPath + "/" + dirName;
		File file = new File(path);
		if (file.mkdir()) {
			System.out.println("Dir is created successfully");
		} else {
			System.out.println("Dir is not created successfully");
		}
	}

	public static void createFileForUser(String filepathwithDir) {
		File file = new File(filepathwithDir);
		try {
			if (file.createNewFile()) {
				System.out.println("File is created successfully");
			} else {
				System.out.println("File is not created successfully");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void writeInToFile(String filepathwithDir, String fileData) {
		File file = new File(filepathwithDir);
		try {
			FileWriter fWriter = new FileWriter(file, true);
			fWriter.write(fileData);
			fWriter.write("\n");
			fWriter.flush();
			fWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readFile(String filepathwithDir, int lineNo) {
		File file = new File(filepathwithDir);
		int checkLineNo = 1;
		String fileData = "";
		try {
			Scanner scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				if(checkLineNo==lineNo) {
				fileData = scanner.nextLine();
				break;
				}
				scanner.nextLine();
				checkLineNo++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileData;
	}

	public static void deleteFileorDir(String fileordir) {
		File file = new File(fileordir);
		if(file.delete())
		{
			System.out.println("File is deleted successfully");
		}
		else {
			System.out.println("File is not deleted successfully");
		}
	}
	
	public static void main(String[] args) {

		// Test.createDirectory("Java");
		// Test.createFileForUser("Java/learnFile.txt");
		// Test.writeInToFile("Java/learn.txt", "Vipul Patel");
         //String url=Test.readFile("Java/learnFile.txt",1);
        // System.out.println(url);
		
		//Scanner scanner = new Scanner(System.in);
		//String userData=scanner.nextLine();
		
		//System.out.println("This is the data that user has enterd :"+userData);
		
		Test.deleteFileorDir("Java");
		
	}
}
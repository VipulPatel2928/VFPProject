package testfile.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFileClass {
	
	public static void readFromFile(String fileName) throws FileNotFoundException {
		File file = new File("java/"+fileName);
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()) {
			System.out.println(scanner.nextLine()); // it will return sentence
			//System.out.println(scanner.next()); // It will return word
		}
	
	}

	public static void main(String[] args) throws FileNotFoundException {
		ReadFromFileClass.readFromFile("test.txt");
		
	}
}

package testfile.com;

import java.io.File;

public class DeleteFileClass {

	public static void deleteFile(String fileName) {
		File file = new File("java/"+fileName);
		if (file.delete())
			System.out.println("File is deleted successfully");
		else
			System.out.println("File is not deleted successfully");
	}

	public static void main(String[] args) {

		DeleteFileClass.deleteFile("test.txt");
	}

}

package testproperties.com;

import java.io.File;

public class CreateDirectoryClass {
	public static void createDirectoryfun(String dirname) {
		String path = System.getProperty("user.dir");
		path = path + "/"+dirname;
		File file = new File(path);
		if (file.mkdir())
			System.out.println("Directory is created successfully");
		else
			System.out.println("Directory is already Exist");
	}

	public static void main(String[] args) {
		
		CreateDirectoryClass.createDirectoryfun("Java");

	}

}

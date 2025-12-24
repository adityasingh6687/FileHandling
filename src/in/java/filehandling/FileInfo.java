package in.java.filehandling;

import java.io.File;

public class FileInfo {
  
	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\hp\\Desktop\\File Handling\\resume.txt");
		if(file.exists())
		{
			System.out.println("File Name: "+file.getName());
			System.out.println("File Path: "+file.getAbsolutePath());
			System.out.println("File Writable: "+file.canWrite());
			System.out.println("File Readable: "+file.canRead());
			System.out.println("File Size: "+file.length());
		}
		else {
			
			System.out.println("File does't exists...");
		}
		
	}
}

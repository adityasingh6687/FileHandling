package in.java.filehandling;

import java.io.File;

public class RenameFile {

	public static void main(String[] args) {
		
		File s = new File("C:\\Users\\hp\\Desktop\\File Handling\\resume.txt");
		File r = new File("C:\\Users\\hp\\Desktop\\File Handling\\intro.txt");
		if(s.exists())
		{
			System.out.println(s.renameTo(r));
		}
		else
		{
			System.out.println("file does't exist...");
		}
	}
}

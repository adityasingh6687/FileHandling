package in.java.filehandling;

import java.io.*;
public class CreateNewFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\hp\\Desktop\\File Handling\\resume.txt");
		if(file.createNewFile())
		{
			System.out.println("File Created Successfully...");
		}
		else {
			System.out.println("File Already Exist...!");
		}
		
		
	}
}

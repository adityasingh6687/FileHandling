package in.java.filehandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream r = new FileInputStream("C:\\Users\\hp\\Desktop\\File Handling\\aditya.txt");
			try {
				int i;
				while((i=r.read())!=-1)
				{
				   System.out.print((char)i);	
				}
			}
				finally 
				{
					r.close();
					System.out.println("\nfile closed successfully...");
				}
				
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

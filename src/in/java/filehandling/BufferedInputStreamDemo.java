package in.java.filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		
		try {
		FileInputStream fileInputStream = new FileInputStream("C:\\Users\\hp\\Desktop\\File Handling\\aditya.txt");
		BufferedInputStream r = new BufferedInputStream(fileInputStream);
		try {
			    int ch;
		        while ((ch = r.read()) != -1) {
		            System.out.print((char) ch);
		        }
		}
		finally {
			r.close();
			System.out.println("\nfile close sucessfully...");
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

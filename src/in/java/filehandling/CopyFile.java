package in.java.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {
		
		try {
			FileInputStream r = new FileInputStream("C:\\Users\\hp\\Desktop\\File Handling\\intro.txt");
			FileOutputStream w = new FileOutputStream("C:\\Users\\hp\\Desktop\\File Handling\\resume.txt");
			try {
			int ch;
			while((ch = r.read())!=-1)
			{
				w.write(ch);
			}
		    }
			finally {
				r.close();
				w.close();
			}
			System.out.println("file copied successfully...");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); 
		}
		
	}
}

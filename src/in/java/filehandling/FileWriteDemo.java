package in.java.filehandling;

import java.io.FileWriter;

public class FileWriteDemo {

	public static void main(String[] args) {

		String str = "Movies";
		
		try {
			FileWriter w = new FileWriter("C:\\Users\\hp\\Desktop\\File Handling\\file1.txt");
			try {
				w.write(str);
			}finally {
				w.close();
			}
			System.out.println("file write successfully...");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}

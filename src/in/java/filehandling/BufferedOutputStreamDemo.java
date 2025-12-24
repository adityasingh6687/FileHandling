package in.java.filehandling;
import java.io.*;
public class BufferedOutputStreamDemo {

		public static void main(String[] args) {

			String str = "Drama";
			byte arr[]= str.getBytes();
			
			try {
				FileOutputStream file = new FileOutputStream("C:\\Users\\hp\\Desktop\\File Handling\\file3.txt");
				BufferedOutputStream w = new BufferedOutputStream(file);
				try {
					w.write(arr);
				} finally {
					w.close();
				}
				System.out.println("file write successfully...");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();			}
		}
	}

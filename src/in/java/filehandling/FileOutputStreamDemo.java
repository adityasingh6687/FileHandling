package in.java.filehandling;
import java.io.FileOutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		String str = "Songs";
		byte arr[]= str.getBytes();
		
		try {
			FileOutputStream w = new FileOutputStream("C:\\Users\\hp\\Desktop\\File Handling\\file2.txt");
			try {
				w.write(arr);
			} finally {
				w.close();
			}
			System.out.println("file write successfully...");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

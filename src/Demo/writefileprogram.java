package Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writefileprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("write file stream program");
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(new File("./Untitled.txt"));
			System.out.println("file founded");
			fos=new FileOutputStream(new File("./newHelloWorld.txt") );
			System.out.println("file created!");
			int data;
			while((data = fis.read()) !=-1) {
				fos.write(data);
			}
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
				System.out.println("files closed");
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}

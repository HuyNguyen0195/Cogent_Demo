package Demo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class filehello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("file stream program");
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(new File("./Untitled 1"));
			System.out.println("file opened!");
			int i;
			while((i = fis.read()) !=-1) {
				System.out.print((char)i);
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
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}

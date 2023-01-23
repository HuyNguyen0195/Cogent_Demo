package Demo;

import java.io.FileReader;
import java.io.FileWriter;

public class filestream1 {
	public static void main(String[] args) throws Exception {
		FileReader fReader=null;
		FileWriter fWriter=null;
		fReader=new FileReader("./Demo.txt");
		fWriter= new FileWriter("./newDemo.txt");
		int ch;
		while((ch=fReader.read()) != -1 ) {
			fWriter.write(ch);
		}
		System.out.println("data copies");
		fReader.close();
		fWriter.close();
	}
}

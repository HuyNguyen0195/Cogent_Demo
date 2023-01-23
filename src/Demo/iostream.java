package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class iostream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bReader= new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("please enter your first name");
			String firstName= bReader.readLine();
			System.out.println("please enter your last name");
			String lastName= bReader.readLine();
			System.out.println("please enter your age");
			String age= bReader.readLine();
			System.out.println("hello mr. "+firstName+ " "+ lastName+" you are "+age+" year old");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("input not correct");
		}
	}

}

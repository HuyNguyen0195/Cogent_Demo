package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.chrono.AbstractChronology;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis;
		FileOutputStream fos;
		ObjectOutputStream oos;
		ObjectInputStream ois;
		try {
			fos = new FileOutputStream("./demo.ser");
			oos = new ObjectOutputStream(fos);
			Employee e= new Employee(1, "HUY NGUYEN", 80);
			oos.writeObject(e);
			System.out.println("serialized success");
			//deserialisze
			fis=new FileInputStream("./demo.ser");
			ois=new ObjectInputStream(fis);
			Object o=ois.readObject();
			Employee e1= (Employee)o;
			System.out.println("employee id"+ e1.id);
			System.out.println("employee name"+ e1.name);
			System.out.println("employee salary"+ e1.salary);
		} catch (Exception e) {
			// TODO: handle exception
			e.fillInStackTrace();
		}
	}

}

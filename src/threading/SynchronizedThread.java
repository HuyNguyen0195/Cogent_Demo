package threading;

import java.lang.reflect.Constructor;

import ArrayListTree.mapdemo;

class MyThread extends Thread{
	DisplayMessage dm;
	String name;
	
	public MyThread(DisplayMessage dm, String name) {
		super();
		this.dm = dm;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		dm.sayHello(name);
	}
	
}
class DisplayMessage{
	public synchronized void sayHello(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("how are you: "+name);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class SynchronizedThread {
	public static void main(String[] args) {
		DisplayMessage dm=new DisplayMessage();
		MyThread t1=new MyThread(dm, "huy");
		MyThread t2=new MyThread(dm, "john");
		t1.start();
		t2.start();
	}
	
}

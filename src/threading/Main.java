package threading;

public class Main {
	public static void main(String[] args) {
		myClass mc= new myClass();
		
		Thread t= new Thread(mc);
		t.start();
	}
}

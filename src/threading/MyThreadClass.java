package threading;

public class MyThreadClass extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<10;i++) {
			System.out.println("mythredclass running");
			Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) {
		MyThreadClass mtc=new MyThreadClass();
		mtc.start();
		try {
			for(int i=0;i<10;i++) {
			System.out.println("main running");
			Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}

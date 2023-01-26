package threading;

class MyThreadNotify extends Thread{
	int total;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("child thread is calculating the sum");

		synchronized (this) {		
			for (int i = 1; i <100; i++) {
				total+=i;
			}
			notify();
		}
		
	}
}
public class notifyWaitThread {
	public static void main(String[] args) throws InterruptedException {
		MyThreadNotify t=new MyThreadNotify();
		t.start();
		synchronized (t) {
			System.out.println("main thread is going wait:");
			t.wait();
			System.out.println("main thread notified");
			System.out.println(t.total);
		}
	}
}

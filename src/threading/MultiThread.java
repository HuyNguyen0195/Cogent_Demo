package threading;

public class MultiThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread name: "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		MultiThread mt1=new MultiThread();
		MultiThread mt2=new MultiThread();
		mt1.setName("mt1");
		mt2.setName("mt2");
		mt1.setPriority(MIN_PRIORITY);
		mt2.setPriority(MAX_PRIORITY);
		mt1.start();
		mt2.start();
	}
}

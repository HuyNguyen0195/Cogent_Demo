package threading;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class InterruptThread extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=0;i<10;i++) {
				System.out.println("i am lazy");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("interrupted");
		}
	}
	
	public static void main(String[] args) {
		InterruptThread it=new InterruptThread();
		it.start();
		it.interrupt();
		System.out.println("end of the main");
		System.out.println("after end");
		
		try {
			int x=5/0;
			System.out.println("sdfsdf"+x);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
	}
}

package threading;

import java.util.Scanner;

public class JoinThead extends Thread{
	static int n, sum=0;
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("sum of first n number");
		System.out.println("enter a value");
		Scanner sc=new Scanner(System.in);
		JoinThead.n=sc.nextInt();
		
		JoinThead jt=new JoinThead();
		jt.setPriority(MAX_PRIORITY);
		jt.start();
		
		/*
		 * try { jt.join(); } catch (InterruptedException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 */
		System.out.println("sum of first "+JoinThead.n+" number is "+JoinThead.sum);
		
		long end=System.currentTimeMillis();
		System.out.println("time taken is "+(end-start)/1000+ " seconds");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<JoinThead.n;i++) {
			JoinThead.sum+=i;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

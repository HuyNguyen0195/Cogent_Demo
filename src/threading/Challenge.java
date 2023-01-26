package threading;

import java.util.Scanner;

public class Challenge extends Thread {
	static int radius=0;
	static double area=0;
	
	public static void main(String[] args) {
		System.out.println("area of circle");
		System.out.println("enter radius value");
		Scanner sc=new Scanner(System.in);
		Challenge.radius=sc.nextInt();
		sc.close();
		Challenge c=new Challenge();
		c.start();
		
		try {
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		 
		System.out.println("area is " + Challenge.area);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("calculating");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Challenge.area=(2*Challenge.radius)*Math.PI;
		
	}
}

package ExemptHandling;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("hi");

		int x= 5/0;

		try {
			int i= 5/0;
			System.out.println("try");

		}
		//catch(Exception e ) {	System.out.println("catch");}
		finally {
			System.out.println("finally");
		}
			System.out.println("bye");

	}
}

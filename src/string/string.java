package string;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("hello worlld");
		Byte b[]= {65,66,67};
		String s1="to day";
		System.out.println("before");
		System.out.println(s1);
		//String s1=new String(b);
		System.out.println(s);
		//System.out.println(s1);
		s1= s.concat(s1);
		System.out.println("after concat:\n"+s1);
	}

}

package string;

public class stringpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "huy nguyen";
        String s2 = "huy nguyen";
        String s3 =  new String("huy nguyen");
 
        System.out.println(s1 == s2); 
        System.out.println(s1 == s3); 
        System.out.println(s1.equals(s2)); 
        System.out.println(s1.equals(s3)); 
	}

}

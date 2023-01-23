package string;

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("hi.");
		sb.append("hello the world");
		System.out.println(sb);
		System.out.println("chart At:"+ sb.charAt(3));
		System.out.println(sb.reverse());
	}

}

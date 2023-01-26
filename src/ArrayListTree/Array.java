package ArrayListTree;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,2,1};
		System.out.println("before");
		for(int e : a) {
			System.out.println(e);
		}
		Arrays.sort(a);
		System.out.println("after");
		for(int e : a) {
			System.out.println(e);
		}
		System.out.println(a);
		String s[]= {"A","V","D","E"};
		Arrays.sort(s);
		for(String e : s) {
			System.out.println(e);
		}
	}

}

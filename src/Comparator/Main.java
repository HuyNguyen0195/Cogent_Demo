package Comparator;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"huy","philip","robert","john","henry"};
		Arrays.sort(s,new StringCompare());
		System.out.println(Arrays.toString(s));
	}

}

package Comparator;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.length() < o2.length()) {
			return -1;
		} else if (o1.length() == o2.length()) {
			return 0;
		} else {
			return 1;
		}
	}
}

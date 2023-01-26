package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class test_arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(new Integer(10));
		list.add(40);
		list.add(25);
		System.out.println(list);
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ArrayList<Integer> list2=new ArrayList();
		for(int i=10; i<100 ; i+=10) {
			list2.add(i);
		}
		System.out.println(list2);
		list2.addAll(2,list);
		System.out.println(list2);
		if(list2.contains(80)) {
			System.out.println("has value");
		} else {
			System.out.println("dont have value");
		}
	}	
}

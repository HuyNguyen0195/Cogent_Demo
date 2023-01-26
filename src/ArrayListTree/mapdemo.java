package ArrayListTree;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapdemo {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("huy", 10 );
		map.put("henry", 20 );
		map.put("john", 20 );
		map.put("terry", 35 );
		map.put("thiago", 40 );
		
		Set<String> keySet=map.keySet();
		System.out.println(keySet);
		Collection<Integer> values=map.values();
		System.out.println(values);
		for(String key : keySet) {
			System.out.println("Key "+ key +" Value "+map.get(key));
		}
	}
}

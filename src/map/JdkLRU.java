package map;

import java.util.LinkedHashMap;

public class JdkLRU {

	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer ,String> lru=new LinkedHashMap(3, 1.0f, true);
		
		lru.put(1, "a");
		lru.put(2, "b");
		lru.put(3, "c");
		lru.put(4, "d");

		
		System.out.println(lru);
		
		
				
				

	}
}

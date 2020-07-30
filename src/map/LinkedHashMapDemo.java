package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	
	public static void main(String[] args) {
		
		int size=2;
		
		Map<Integer, Integer> lru=new LinkedHashMap(2,2,true){
			@Override
			protected boolean removeEldestEntry(java.util.Map.Entry eldest) {
				// TODO Auto-generated method stub
				if(size()>size){
					return true;
				}else{
					return false;
				}
			}
		};
		
		
		//LRUCache lru = new LRUCache( 2 /* capacity */ );

    	lru.put(1, 1);
    	lru.put(2, 2);
    	System.out.println(lru.get(1));       // returns 1
    	lru.put(3, 3);    // evicts key 2
    	System.out.println(lru.get(2));       // returns -1 (not found)
    	lru.put(4, 4);    // evicts key 1
    	System.out.println(lru.get(1));       // returns -1 (not found)
    	System.out.println(lru.get(3));       // returns 3
    	System.out.println(lru.get(4));       // returns 4
    	
		
		
	}
}

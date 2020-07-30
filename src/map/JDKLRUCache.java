package map;

import java.util.LinkedHashMap;
import java.util.Map;

class JDKLRUCache {

	public static Map<Integer, Integer> lru=null;
	
    public JDKLRUCache(int capacity) {
    	int size=capacity;
    	
    	 lru=new LinkedHashMap(2,2,true){
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
    	
        
    }
    
    public int get(int key) {
        
    	Integer i=lru.get(key);
    	if(i==null){
    		return -1;
    	}else{
    		return i;
    	}
    	
    }
    
    public void put(int key, int value) {
        lru.put(key, value);
    }
    
    
    public static void main(String[] args) {
		
    	JDKLRUCache cache = new JDKLRUCache( 2 /* capacity */ );

    	cache.put(1, 1);
    	cache.put(2, 2);
    	cache.get(1);       // returns 1
    	cache.put(3, 3);    // evicts key 2
    	cache.get(2);       // returns -1 (not found)
    	cache.put(4, 4);    // evicts key 1
    	cache.get(1);       // returns -1 (not found)
    	cache.get(3);       // returns 3
    	cache.get(4);       // returns 4
    	
	}
}


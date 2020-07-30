package map;

import java.util.Arrays;

public class DemoRunMap {

	
	public static void main(String[] args) {
		
		OwnHashMap hashMap=new OwnHashMap();
		
		hashMap.put(1, 10);
		hashMap.put(2, 20);
		hashMap.put(4, 40);
		hashMap.put(4, 430);
		hashMap.put(4, 401);
		hashMap.put(8, 201);
		hashMap.put(8, 208);
		hashMap.put(2, 209);
		
		/*for(int i=0;i<100;i++){
			hashMap.put(i, i+500);
		}*/
		
		System.out.println(Arrays.toString(hashMap.getMap()));
		
		//System.out.println(OwnHashMap.size());
		
		//System.out.println(OwnHashMap.get(2));
		
		
	}
}

package adhoc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Delete1 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();

		int[] nums = { 10, 10, 7, 7, 7, 9, 9, 9, 9, 8, 8, 8, 5, 5 };

		int k=2;
		
		for (int i : nums) {
			int v = map.getOrDefault(i, 0);
			map.put(i, v + 1);
		}
		
		System.out.println(map);
		
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(collector)
		
		
		System.out.println();
	}
}

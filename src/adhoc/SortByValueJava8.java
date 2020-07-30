package adhoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValueJava8 {

	public static void main(String[] args) {

		

		int[] nums = { 10, 10, 7, 7, 7, 9, 9, 9, 9, 8, 8, 8, 5, 5 };

		int k = 3;

		System.out.println(Arrays.toString(topKFrequent(nums, k)));
		
	}
	
	 public static int[] topKFrequent(int[] nums, int k) {
		 Map<Integer, Integer> map = new HashMap<>();
		 for (int i : nums) {
				int v = map.getOrDefault(i, 0);
				map.put(i, v + 1);
			}

			Map<Integer, Integer> sortedByCount = map.entrySet().stream().sorted((a,b)->b.getValue()-a.getValue())
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

			System.out.println(sortedByCount);

			List<Integer> list=new ArrayList<>();
			
			for (Map.Entry<Integer, Integer> me : sortedByCount.entrySet()) {
				list.add(me.getKey());
				k--;
				if(k==0) break;
			}
			
			int[] ans=new int[list.size()];
			
			for(int i=0;i<list.size();i++) {
				ans[i]=list.get(i);
			}
			return ans;
	 }
}

package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IdenticalArrays {

	
	public static void main(String[] args) {
		
		String[] sa={"cat","atc","dog","god","ff"};
		
		//System.out.println(indenticalAnagrams(sa));
		
		System.out.println(groupAnagrams(sa));
		
	}
	
	public static List<List<String>> indenticalAnagrams(String[] strs){
		
		if(strs.length==0) return null;
		
		List<List<String>> lists=new ArrayList<List<String>>();
		
		Map<String, List<String>> hMap=new HashMap<>();
		
		for(String s:strs){
			
			char[] ch=s.toCharArray();
			
			Arrays.sort(ch);
			
			String key=new String(ch);
			if(hMap.containsKey(key)){
				
				List<String> list=hMap.get(key);
				
				list.add(s);
				
			}else{
				List<String> list=new ArrayList<>();
				list.add(s);
				
				lists.add(list);
				
				hMap.put(key, list);
				
			}
			
			
		}
		return lists;
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) { 
		   int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
		    
		            List<List<String>> res = new ArrayList<>();
		            HashMap<Integer, Integer> map = new HashMap<>();
		            for (String s : strs) {
		                int key = 1;
		                for (char c : s.toCharArray()) {
		                    key *= prime[c - 'a'];
		                   // System.out.println("c key "+c+" "+key);
		                }
		                List<String> t;
		                
		                System.out.println("s key "+s+"   "+key);
		                
		                if (map.containsKey(key)) {
		                    t = res.get(map.get(key));
		                } else {
		                    t = new ArrayList<>();
		                    res.add(t);
		                    map.put(key, res.size() - 1);
		                }
		                t.add(s);
		            }
		            
		            System.out.println(map);
		            
		            return res;
		    }
	
}

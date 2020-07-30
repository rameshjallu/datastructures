package adhoc;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.SortedSet;
import java.util.*;

public class SortByValue {
	
	static <K,V extends Comparable<? super V>>
	SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
	    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	        new Comparator<Map.Entry<K,V>>() {
	            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	                int res = e2.getValue().compareTo(e1.getValue());
	                return res != 0 ? res : 1;
	            }
	        }
	    );
	    sortedEntries.addAll(map.entrySet());
	    return sortedEntries;
	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> nonSortedMap = new HashMap<String, Integer>();
		/*nonSortedMap.put("ape", -1);
		nonSortedMap.put("pig", 3);
		nonSortedMap.put("cow", 1);
		nonSortedMap.put("frog", 92);
		*/
		
		for(char ch: "tree".toCharArray()){
			if(nonSortedMap.containsKey(ch+"")){
				System.out.println("found "+ch);
				int v=nonSortedMap.get(ch+"");
				nonSortedMap.put(ch+"", v+1);
			}else{
				System.out.println("not found "+ch);
				nonSortedMap.put(ch+"", 1);
			}
		}

		StringBuilder builder=new StringBuilder();
		
		for (Entry<String, Integer> entry  : entriesSortedByValues(nonSortedMap)) {
		    System.out.println(entry.getKey()+":"+entry.getValue());
		    for(int i=1;i<=entry.getValue();i++){
		    	builder.append(entry.getKey());
		    }
		}
		
		System.out.println("builder "+builder.toString());
		
	}
	
	public String frequencySort(String s) {
  		
		Map<String, Integer> nonSortedMap = new HashMap<String, Integer>();

		
		for(char ch: s.toCharArray()){
			if(nonSortedMap.containsKey(ch+"")){
				System.out.println("found "+ch);
				int v=nonSortedMap.get(ch+"");
				nonSortedMap.put(ch+"", v+1);
			}else{
				System.out.println("not found "+ch);
				nonSortedMap.put(ch+"", 1);
			}
		}

		StringBuilder builder=new StringBuilder();
		
		for (Entry<String, Integer> entry  : entriesSortedByValues(nonSortedMap)) {
		    System.out.println(entry.getKey()+":"+entry.getValue());
		    for(int i=1;i<=entry.getValue();i++){
		    	builder.append(entry.getKey());
		    }
		}
		
		System.out.println("builder "+builder.toString());
		
		return builder.toString();
    }

}

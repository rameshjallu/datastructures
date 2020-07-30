package sortedDS;

import java.util.TreeMap;



public class MyCalendar1 {

	TreeMap<Integer, Integer> treeMap =null;
	
	public MyCalendar1(){
		treeMap=new TreeMap<>();

	}
	public static void main(String[] args) {

		MyCalendar1 obj = new MyCalendar1();
		
		int start=47;
		int end=50;
		
		System.out.println(obj.book(start,end));
		
		start=33;
		end=41;
		
		System.out.println(obj.book(start,end));
		
		start=39;
		end=45;
		
		System.out.println(obj.book(start,end));
		
		start=33;
		end=42;
		
		System.out.println(obj.book(start,end));
		
		start=25;
		end=32;
		
		System.out.println(obj.book(start,end));
		
		
		start=26;
		end=35;
		
		System.out.println(obj.book(start,end));
		
		start=19;
		end=25;
		
		System.out.println(obj.book(start,end));
		
		start=3;
		end=8;
		
		System.out.println(obj.book(start,end));
		
		start=8;
		end=13;
		
		System.out.println(obj.book(start,end));
		
		start=18;
		end=27;
		
		System.out.println(obj.book(start,end));
		
		//System.out.println(treeMap);
		
		
	}

	public boolean book(int start, int end) {

		if (this.treeMap.size() == 0) {
			treeMap.put(start, end);
			
			return true;
		} else {

			
			Integer ceilK=treeMap.ceilingKey(start);
			
			if(ceilK!=null){
				if(end>ceilK){
					return false;
				}
			}
			
			Integer floorK=treeMap.floorKey(start);
			
			if(floorK!=null){
				
				int floorV=treeMap.get(floorK);
				
				/*System.out.println("start end "+start+" -- "+end);
				System.out.println("floorK floorV "+floorK+"--"+floorV);
				*/
				if(floorV>start){
					return false;
				}
			}
		}
		treeMap.put(start, end);
		return true;
	}
}

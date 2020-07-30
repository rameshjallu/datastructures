package heap;

import java.util.ArrayList;
import java.util.List;

public class MyCalendar {

	public static List<Pair> list=new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		MyCalendar obj = new MyCalendar();
		
		int start=47;
		int end=50;
		
		obj.book(start,end);
		
		start=33;
		end=41;
		
		obj.book(start,end);
		
		start=39;
		end=45;
		
		obj.book(start,end);
		
		start=33;
		end=42;
		
		obj.book(start,end);
		
		start=25;
		end=32;
		
		obj.book(start,end);
		
		/*
		int start=10;
		int end=20;
		
		obj.book(start,end);
		
		start=15;
		end=25;
		
		obj.book(start,end);
		
		start=20;
		end=30;
		
		obj.book(start,end);
		*/
	}
    public MyCalendar() {
        
    }
    
    public boolean book(int start, int end) {
        
    	Pair p=new Pair(start, end);
    	return verifyinList(p);
    }
    public boolean verifyinList(Pair incomePair){
    	
    	boolean addList=true;
    	
    	for(Pair existingPair:list){
    		
    		if(incomePair.start<=existingPair.start  && existingPair.start<incomePair.end && incomePair.end<existingPair.end){
    			System.out.println("Not Added1 "+incomePair);
    			return false;
    		}
			if(incomePair.start<=existingPair.start  && existingPair.start<existingPair.end && existingPair.end<incomePair.end){
				System.out.println("Not Added2 "+incomePair);
    			return false;			
			}
			if(existingPair.start<=incomePair.start  && incomePair.start<incomePair.end && incomePair.end<existingPair.end){
				System.out.println("Not Added 3"+incomePair);
    			return false;
			}
			if(existingPair.start<=incomePair.start  && incomePair.start<existingPair.end && existingPair.end<incomePair.end){
				System.out.println("Not Added4 "+incomePair);
    			return false;
			}
    		
    	}
    	System.out.println("Added "+incomePair);
    	list.add(incomePair);
    	
    	return addList;
    	
    }
    
    class Pair{
    	int start;
    	int end;
    	
    	public Pair(int start, int end){
    		this.start=start;
    		this.end=end;
    	}

		@Override
		public String toString() {
			return "Pair [start=" + start + ", end=" + end + "]";
		}
    	
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
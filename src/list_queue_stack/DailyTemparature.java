package list_queue_stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemparature {

	public static void main(String[] args) {

		//int[] T={73,74,75,71,69,72,76,73};
		
		int[] T={73,74,75,71,69,68,67,66,74};
		
		//int[] T={84,3,2,91,97};
		
		System.out.println(Arrays.toString(dailyTemperatures2(T)));
		
	}

	public static int[] dailyTemperatures(int[] T) {
		

		int c=0;
		for(int i=0;i<T.length;i++){
			c=0;
			for(int j=i+1;j<T.length;j++){
				
				if(T[i]<T[j]){
					
					c++;
					break;
				}else{
					c++;
				}
				if(j==T.length-1){
					c=0;
				}
				
			}
			T[i]=c;
		}
		return T;
	}

	public static int[] dailyTemperatures2(int[] T) {
		
		System.out.println("ori array  "+Arrays.toString(T));
        int[] ret = new int[T.length];
        if(T.length == 0) return ret;
        
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < T.length;++i) {
        	
        	
            while(!st.empty() && T[i] > T[st.peek()]) {
            	
            	
            	
            	System.out.println("T[i] T[st.peek()] "+T[i]+"  "+T[st.peek()]);
            	
            	
                int index = st.pop();
                ret[index] = i - index;
                
                System.out.println("op array "+Arrays.toString(ret));
            }
            st.push(i);
            
            System.out.println("stack "+st);
            
        }
        System.out.println(st);
        
        while(!st.empty()) {
            ret[st.pop()] = 0;
        }
        
        return ret; 
    }
	
}

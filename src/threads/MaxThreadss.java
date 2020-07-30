package threads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MaxThreadss {

	
	public static void main(String[] args) {
		
		ThreadPoolExecutor executor=new ThreadPoolExecutor(1000000, 1000000, 5,TimeUnit.SECONDS,  new LinkedBlockingQueue<>());
		
		Collection<String> c=new ArrayList<String>();
		
		for(int i=0;i<500000;i++){
			
			Task t1=new Task(""+i);
			
			executor.submit(t1);
		}
	}
}

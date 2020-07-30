package threads;

public class Task implements Runnable {

	
	String str;
	
	public Task(String str){
		this.str=str;
	}
	
	public void run(){
		
		try {
			
			System.out.println(Thread.currentThread()+" : "+str);
			Thread.sleep(Integer.MAX_VALUE);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

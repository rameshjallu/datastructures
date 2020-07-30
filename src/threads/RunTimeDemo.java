package threads;

public class RunTimeDemo {

	
	public static void main(String[] args) {
		
		
		
		System.out.println(Runtime.getRuntime().availableProcessors()+" : "+System.getenv("NUMBER_OF_PROCESSORS"));
	}
}

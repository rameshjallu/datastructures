package strings;

public class Demo {

	public static void main(String[] args) {
		
		String s="12321";
		
		String rev=new StringBuilder().append(s).reverse().toString();
		
		if(s.equals(rev)) {
			System.out.println("palli");
		}
		
		reverseString("hello".toCharArray());
	}
	
	 public static void reverseString(char[] s) {
	        
	        for(int i=0;i<s.length/2;i++){
	            char temp=s[i];
	            s[i]=s[s.length-i-1];
	            s[s.length-i-1]=temp;
	            
	        }
	        
	        System.out.println(new String(s));
	    }
}

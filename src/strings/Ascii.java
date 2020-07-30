package strings;

import java.io.UnsupportedEncodingException;

public class Ascii {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String s = "admin$#@`ఏసీలో 40 పాము పిల్లలు.. యూపీలో షాకింగ్ ఘటన";
	    //byte[] bytes = s.getBytes("US-ASCII");
		byte[] bytes = s.getBytes("UTF-32");
		
		
	    System.out.println(new String(bytes));
	    
	    System.out.println(toHex("ఈ")); //prints 0C08
	    
	    
	}
	
	static String toHex(String b) {
		String s="";
		for (int i=0; i<b.length(); ++i) s+=String.format("%04X",b.charAt(i)&0xffff);
		    return s;
		}
		
}

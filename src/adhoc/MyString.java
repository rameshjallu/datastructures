package adhoc;

import java.util.Comparator;
import java.util.TreeMap;

public class MyString implements Comparator<MyString>{

	String str;
	
	public MyString(String str){
		this.str=str;
	}
	
	@Override
	public int compare(MyString o1, MyString o2) {
		
		TreeMap<MyString, Integer> tmap= null;
		
		Integer i1=tmap.get(o1);
		if(i1==null) i1=new Integer(0);
		Integer i2=tmap.get(o2);
		if(i2==null) i2=new Integer(0);
		
		return i1-i2;
		
		
	}
}

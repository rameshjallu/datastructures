package bitwise;

public class SingleNumberIII {

	public static void main(String[] args) {
		int[] nums= {1,2,1,3,2,5};
		
		int s=0;
		
		for(int i:nums) {
			s=s^i;
		}
		System.out.println(s);
		
		for(int i:nums) {
			int s1=s^i;
			
			int s2=s1^i;
			
			System.out.println(s+"^"+i+"="+s1+":"+s2);
			//if(s3==s) {
			//	System.out.println("ele "+i);
			//}
		}
	}
}

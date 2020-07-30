package adhoc;

public class ExclusiveDemo {

	
	public static void main(String[] args) {
		
		int[] nums={9,6,4,2,3,5,7,0,1};
		
		int ex=nums[0];
		
		for(int i=1;i<nums.length;i++){
			
			ex=ex^nums[i];
		}
		
		for(int i=0;i<=nums.length;i++){
			ex=ex^i;
		}
		
		System.out.println(ex);
		//return ex;
	}
}

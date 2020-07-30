package adhoc;

public class MaximumSubArray {

	public static void main(String[] args) {
		
		int[] ia= {-1,-2,4,-1,3};
		
		System.out.println(msa(ia, 0));
	}
	
	public static int msa(int[] ia,int i) {
		
		if(i==ia.length-1) return ia[i];
		int p1=ia[i]+Math.max(0, csum(i+1,ia));
		int p2=msa(ia,i+1);
		return Math.max(p1, p2);
	}
	
	public static int csum(int i,int[] ia) {
		
		int sum=0;
		
		for(;i<ia.length;i++) {
			sum=sum+ia[i];
		}
		return sum;
	}
}

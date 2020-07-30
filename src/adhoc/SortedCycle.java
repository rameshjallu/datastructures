package adhoc;

public class SortedCycle {

	public static void main(String[] args) {
		
		//int[] ia={1,6,7,9,11,34,-65};
		
		//int[] ia={5,6,7,9,11,34,-65,0,1,2,3,4};
		
		int[] ia={5, 6, 7, 8, 9, 10, 1, 2, 3};
		
		m(0, ia.length-1, ia);
		
	}
	
	public static void m(int l,int m,int[] ia){
		
		int mid;
		while(l<m){
			
			mid=(l+m)/2;
			
			if(ia[mid]>ia[m]){
				l=mid+1;
			}else if(ia[mid]<ia[l]){
				m=mid;
			}else{
				System.out.println(ia[mid]);
				break;
			}
		}
	}
}

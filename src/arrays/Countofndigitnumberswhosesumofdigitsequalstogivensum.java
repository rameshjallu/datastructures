package arrays;

import java.util.ArrayList;
import java.util.List;

public class Countofndigitnumberswhosesumofdigitsequalstogivensum {

	static int ans=0;
	/*
	 * 
	 * Input: n = 2, sum = 2 Output: 2 Explanation: Numbers are 11 and 20
	 * 
	 * Input: n = 2, sum = 5 Output: 5 Explanation: Numbers are 14, 23, 32, 41 and
	 * 50
	 * 
	 * Input: n = 3, sum = 6 Output: 21
	 */
	public static void main(String[] args) {

		aux(3, 0, new ArrayList<Integer>(), 6);
		System.out.println("ans "+ans);
	}

	public static void aux(int n, int lsum,List<Integer> list, int sum) {
		//System.out.println(n+":"+lsum+":"+list+":"+sum);
		if (lsum > sum || list.size()>n)
			return;

		if (lsum == sum && list.size()==n) {
			System.out.println(" "+list);
			ans++;
		} else {
			for (int i = 0; i <= 9; i++) {
				List<Integer> l=new ArrayList<>();
				l.addAll(list);
				if(i==0 ) {
					if(l.size()>0) {
						l.add(i);
						aux(n, lsum+i, l, sum);
					}
					
				}else {
					l.add(i);
					aux(n, lsum+i, l, sum);
				}
				
				
			}
			
			
		}

	}
}

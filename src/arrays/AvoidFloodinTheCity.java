package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AvoidFloodinTheCity {

	public static void main(String[] args) {

	}

	public static int[] avoidFlood(int[] rains) {
		int[] ans = new int[rains.length];

		Set<Integer> fullSet = new HashSet<>();
		List<Integer> zeros = new ArrayList<>();

		for (int i = 0; i < rains.length; i++) {

			if(fullSet.contains(rains[i])) {
				if(zeros.size()==0) return null;
				
			}else {
				ans[i]=-1;
			}
		}
		
		
		return ans;
	}
}

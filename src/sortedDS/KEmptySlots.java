package sortedDS;

import java.util.TreeSet;

public class KEmptySlots {

	public static void main(String[] args) {
		// https://www.leetfree.com/problems/k-empty-slots.html

		KEmptySlots emptySlots=new KEmptySlots();
		
		int[] flowers= {1,4,5,3,2};
		int k= 1;
		
		System.out.println(emptySlots.kthEmptySlots(flowers, k));
		
		
	}

	public int kthEmptySlots(int[] flowers, int k) {

		TreeSet<Integer> treeSet = new TreeSet<>();
		int slot=-1;

		for (int day = 0; day < flowers.length; day++) {

			System.out.println(treeSet);
			
			int bloomsDay=flowers[day];
			
			Integer ceilK = treeSet.ceiling(bloomsDay);

			if (ceilK != null) {

				if((ceilK-bloomsDay-1)==k){
					slot=day+1;
					break;
				}
			}

			Integer floorK = treeSet.floor(bloomsDay);

			if (floorK != null) {

				System.out.println("(bloomsDay-floorK-1)==k "+bloomsDay+" - "+floorK+" - "+k);
				if((bloomsDay-floorK-1)==k){
					slot=day+1;
					break;
				}
				
			}
			
			treeSet.add(bloomsDay);
			
			
		}
		return slot;
	}
}

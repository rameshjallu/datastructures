package sortedDS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class KthSmallestInteger {

	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		int[] in = new int[n];

		for (int i = 0; i < n; i++) {
			in[i] = i + 1;
		}
		System.out.println(kthSmallest1(in, k));
		System.out.println(kthSmallest2(in, k));
		System.out.println(kthSmallest3(in, k));
		System.out.println(kthSmallest4(in, k));
		System.out.println(kthSmallest5(in, k));

	}

	// sorting
	public static int kthSmallest1(int[] in, int k) {

		if (in.length < k)
			return Integer.MIN_VALUE;
		Arrays.sort(in);
		return in[k - 1];

	}

	// binary search tree
	public static int kthSmallest2(int[] in, int k) {

		if (in.length < k)
			return Integer.MIN_VALUE;
		TreeSet<Integer> tset = new TreeSet<>();

		for (int x : in) {
			tset.add(x);
		}

		int c = 0;
		for (int i : tset) {
			c++;
			if (k == c) {
				return i;
			}
		}

		return Integer.MIN_VALUE;

	}

	// min heap
	public static int kthSmallest3(int[] in, int k) {

		if (in.length < k)
			return Integer.MIN_VALUE;
		
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		
	
		for (int x : in) {
			minHeap.add(x);
		}

		int v = 0;
		for (int i=1;i<=k;i++) {
			 v=minHeap.poll();
		}

		return v;

	}
	
	// max heap
		public static int kthSmallest4(int[] in, int k) {

			if (in.length < k)
				return Integer.MIN_VALUE;
			
			PriorityQueue<Integer> maxHeap=new PriorityQueue<>(k,new MyComparator());
			
			int i=0;
		
			for (;i<k;i++) {
				maxHeap.add(in[i]);
			}

			for(;i<in.length;i++){
				if(in[i]<maxHeap.peek()){
					maxHeap.add(in[i]);
				}
			}
			
			//System.out.println(maxHeap);

			return maxHeap.peek();

		}
		
		static class MyComparator implements Comparator<Integer>{
			public int compare(Integer e1,Integer e2){
				return e2-e1;
			}
		}

		//partial quicksort
		public static int kthSmallest5(int[] in, int k) {
			
			int pivotIndex=getPivot(in);
			
			return auxPartialQuick(0, in.length, in, k, 0);
			
			
			
		}
		
		public static int auxPartialQuick(int i,int j,int[] in,int k,int p){
			
			System.out.println("k p "+k+" - "+p);
			if(i>j) return Integer.MIN_VALUE;
			if(k==p) return k;
			if(p>k) {
				return auxPartialQuick(i, p-1, in, k, p);
			}else{
				return auxPartialQuick(p+1, j, in, k+p-1, p);
			}
			
		}
		
		public static int getPivot(int[] in){
			return 0;
		}
		
}

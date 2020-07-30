package bitwise;

import java.util.Arrays;

public class SingleNumberII {

	public static void main(String[] args) {
		int[] nums= {1,1,1,2};
		//int[] nums= {0,1,0,1,0,1,99};
		
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
		
		System.out.println(Arrays.toString(nums));
        int ones = 0, twos = 0, not_threes = 0;
        for(int n : nums) {
            twos |= (ones & n);
            ones ^= n;
            not_threes = ~(ones & twos);
            ones &= not_threes;
            twos &= not_threes;
            
            System.out.println("ones "+ones);
            System.out.println("twos "+twos);
            System.out.println("not_threes "+not_threes);
            System.out.println();
        }
        
        return ones;
    }
}

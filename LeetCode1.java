
public class LeetCode1 {
	
	//Two Sums
	//Passed
	
	
	public static int[] twosums(int[] nums, int target) {
		
		int[] results = new int[2];
		int size = nums.length;
		
		
		
	for(int i = 0; i < size;i++) {
		
		//This loop waits until the below loop finish before increasing by 1.
		
		//System.out.println(i);
		for(int j = 0; j < size; j++) {
			
			
		//	System.out.println("i "+ i+"j " +j);
			
			if(nums[i] + nums[j] == target && i != j) {
				//Make sure indexes in the array are not the same;
				results[0] = i;
				results[1] = j;
			}
			
			
		}
		
		
		
	}
		
		
		
		return results;
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,7,11,15};
		int[] nums1 = {2,4,11,3};
		
		int[] results = twosums(nums,9);
		int[] results1 = twosums(nums1,7);
		for(int i: results1) {
			
			
		
		System.out.println(i);
		}
		
		
		
	}

}

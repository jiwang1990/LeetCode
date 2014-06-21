
public class Candy {
	public static int candy(int[] ratings) {
		 if(ratings == null || ratings.length == 0)
	            return 0;
	        int[] nums = new int[ratings.length];
	        nums[0] = 1;
	        for(int i = 1; i < nums.length; i++){
	            if(ratings[i] >= ratings[i-1])
	                nums[i] = nums[i-1]+1;
	            else
	                nums[i] = 1;
	        }
	        int result = nums[nums.length-1];
	        for(int i = ratings.length-2; i >= 0; i--){
	            if(ratings[i] > ratings[i+1])
	                nums[i] = Math.max(nums[i+1]+1, nums[i]);
	            result += nums[i];
	        }
	        for(int i = 0; i < nums.length; i++){
	        	System.out.println(nums[i]);
	        }
	        return result;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] r = new int[]{2, 2};
		System.out.println(candy(r));
	}

}

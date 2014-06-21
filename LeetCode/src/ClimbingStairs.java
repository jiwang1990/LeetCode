
public class ClimbingStairs {
	 public int climbStairs(int n) {
	        if(n <= 0)
	            return 0;
	        if(n == 1)
	            return 1;
	        if(n == 2)
	            return 2;
	        else{
	            int previous = 1;
	            int result = 2;
	            for(int i = 3; i <= n; i++){
	                int temp = result;
	                result += previous;
	                previous = temp;
	            }
	            return result;
	        }
	    }
}

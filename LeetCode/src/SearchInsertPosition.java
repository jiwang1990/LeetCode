
public class SearchInsertPosition {
	 public int searchInsert(int[] A, int target) {
	        if(A == null || A.length == 0)
	            return -1;
	        return search(A, target, 0, A.length-1);
	    }
	    
	    public int search(int[] A, int target, int start, int end){
	        int middle = (start+end)/2;
	        if(target == A[middle])
	            return middle;
	        else if(target < A[middle])
	            return (start < middle) ? search(A, target, start, middle-1) : start;
	        else
	            return (middle < end) ? search(A, target, middle+1, end) : (end+1);
	    }
}

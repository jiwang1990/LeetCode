
public class RemoveElement {
	 public int removeElement(int[] A, int elem) {
	        if(A == null || A.length == 0)
	            return 0;
	        int len = A.length;
	        for(int i = A.length-1; i >= 0; i--){
	            if(elem == A[i]){
	                A[i] = A[len-1];
	                len--;
	            }
	        }
	        return len;
	    }
}

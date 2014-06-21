
public class SingleNumberII {
	public int singleNumber(int[] A) {
        if(A == null || A.length == 0)
            return 0;
        int result = 0;
        int[] counts = new int[32];
        
        for(int i = 0; i < 32; i++){
            for(int j = 0; j < A.length; j++){
                if(((A[j] >> i) & 1) == 1)
                    counts[i] = (counts[i] + 1) % 3; 
            }
            result |= (counts[i] << i);
        }
        return result;
    }
}

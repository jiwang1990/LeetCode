import java.util.ArrayList;
import java.util.List;


public class Combinations {
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combList = new ArrayList<List<Integer>>();
        List<Integer> comb = new ArrayList<Integer>();
        if(n < k)
            return combList;
        comb(combList, comb, k, n, 1);
        return combList;
    }
    
    public void comb(List<List<Integer>> combList, List<Integer> comb, int k, int n, int start){
        if(comb.size() == k){
            combList.add(new ArrayList<Integer>(comb));
            return;
        }
        for(int i = start; i <= n; i++){
            comb.add(i);
            comb(combList, comb, k, n, i+1);
            comb.remove(comb.size()-1);
        }
    }
}

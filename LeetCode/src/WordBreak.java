import java.util.Set;

/**
 * DP(Dynamic Programming)
 * 自底向上的方法
 * @author binge
 *
 */
public class WordBreak {
	public boolean wordBreak(String s, Set<String> dict) {
		if(s == null || s.length() == 0 || dict.isEmpty())
			return false;
		int len = s.length();
		boolean[][] table = new boolean[len][len];
		for(len = 1; len <= s.length(); len++){
			for(int index = 0; index < s.length()-len+1; index++){
				if(dict.contains(s.substring(index, index+len))){
					table[index][index+len-1] = true;
					continue;
				}
				for(int k = 1; k < len; k++){
					if(table[index][index+k-1] && table[index+k][index+len-1]){
						table[index][index+len-1] = true;
						break;
					}
				}
			}
		}
		return table[0][s.length()-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private static class ListNode {
    	int val;
    	ListNode next;
    	
    	ListNode(int x){
    		val = x;
    		next = null;
    	}
    }

}

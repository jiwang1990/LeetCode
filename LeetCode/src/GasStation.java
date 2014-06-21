
public class GasStation {
	public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = -1;
        int sum = 0;
        int total = 0;
        for(int i = 0; i < gas.length; i++){
            sum += (gas[i] - cost[i]);
            total += (gas[i] - cost[i]);
            
            if(sum < 0){
                sum = 0;
                index = i;
            }
        }
        if(total < 0)
            return -1;
        return index+1;
    }
}

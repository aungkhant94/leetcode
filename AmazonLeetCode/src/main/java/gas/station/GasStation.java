package gas.station;
//https://leetcode.com/problems/gas-station/
public class GasStation {

    public static int canCompleteCircuit(int[] gas, int[] cost) {

        for(int i=0;i< gas.length-1;i++) {
            int gasTank = 0;
            int index = i;
            do {
                gasTank = gasTank+gas[index] - cost[index];
                if(gasTank<0)
                    break;
                index = next(index, gas.length);
            } while (index != i);
            if(gasTank>=0){
                return i;
            }
        }
        return -1;
    }

    private static int next(int index, int length){

        if(index==length-1)
            return 0;
        return index+1;
    }
    public static void main(String[] args) {

//        int[] gas = {1,2,3,4,5};
//        int[] cost = {3,4,5,1,2};

        int[] gas = {2,3,4};
        int[] cost = {3,4,3};

        canCompleteCircuit(gas,cost);
        }



}

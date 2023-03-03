package hackerRank;

import java.util.List;

public class MaxSubSum {

    public long maxSubArray(List<Integer> nums) {
        long currentSubarray = nums.get(0);
        long maxSubarray = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            long num = nums.get(i);

            currentSubarray = Math.max(num, currentSubarray + num);
            maxSubarray = Math.max(maxSubarray, currentSubarray);
        }

        return maxSubarray;
    }
}


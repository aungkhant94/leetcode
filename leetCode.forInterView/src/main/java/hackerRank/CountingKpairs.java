package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingKpairs {
    public static int countingPairs(int[] arr, int k){

        HashMap <Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i = 0; i < arr.length; i++) {

            // initializing value to 0, if key not found
            if (!hm.containsKey(arr[i]))
                hm.put(arr[i], 0);

            hm.put(arr[i], hm.get(arr[i]) + 1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i = 0; i <arr.length; i++) {
            if (hm.get(k - arr[i]) != null)
                twice_count += hm.get(k - arr[i]);

            // if (arr[i], arr[i]) pair satisfies the
            // condition, then we need to ensure that the
            // count is decreased by one such that the
            // (arr[i], arr[i]) pair is not considered
            if (k - arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count / 2;






    }

    public  static void main (String[] args) {
        int arr[] = new int[] {  1, 1, 2,2,3,3 };

        System.out.println(countingPairs(arr,1));

    }




}

package hackerRank;

import java.util.Collections;
import java.util.List;

public class DoubleSize {
    public static long doubleSize(List<Long> arr, long num) {
        Collections.sort(arr);
        if(num <= 0) return 0;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) == num) num = num * 2;
        }
        return num;
    }
}

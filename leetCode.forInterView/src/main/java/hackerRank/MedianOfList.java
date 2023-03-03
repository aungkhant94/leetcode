package hackerRank;

import java.util.Collections;
import java.util.List;

public class MedianOfList {

    public int median(List<Integer> arr){
        Collections.sort(arr);
        int n= arr.size();
        return n%2==0 ? arr.get(n/2) : (arr.get(n/2 -1 )+ arr.get(n/2 +1 ))/2 ;

    }
}

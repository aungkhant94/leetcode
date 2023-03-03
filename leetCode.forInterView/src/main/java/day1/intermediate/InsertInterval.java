package day1.intermediate;


import java.util.ArrayList;
import java.util.List;

//57. Insert Interval
public class InsertInterval {
    public static boolean isBetween(int[] inter, int val){
        if(val>=inter[0] && val<inter[1])
            return true;
        return false;
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        boolean startSet = false;
        boolean endSet = false;
        List<int[]> result = new ArrayList<>();
        for(int i=0; i<intervals.length ; i++){
            int[] cursor = intervals[i];
            if(!startSet){
                if(isBetween(cursor,newInterval[0])) {
                    startSet = true;
                    if (newInterval[1] < intervals[i + 1][0]) {
                        endSet = true;
                        cursor[1] = newInterval[1];
                    }
                    result.add(cursor);
                }else if(newInterval[0]<cursor[0]){
                    startSet = true;
                    cursor[0] = newInterval[0];
                    result.add(cursor);
                }else if(newInterval[0]> cursor[1]) {
                    result.add(cursor);
                }
            } else if(startSet && !endSet){
                int[] last = result.get(result.size()-1);
                if(isBetween(cursor,newInterval[1])){
                    endSet = true;
                    last[1] = cursor[1];
                    result.set(result.size()-1, last);
                }else if (cursor[0]> newInterval[1]){
                    endSet = true;
                    last[1] = newInterval[1];
                    result.set(result.size()-1, last);
                }else if(cursor[1]< newInterval[1]){
                }
            }else {
                result.add(cursor);
            }
        }
        int[][] res = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        //int[][] intervals = {{1,3},{6,9}};
        int[][] intervals = {{1,5}};
        //int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        //int[] newIntervals = {4,8};
        int[] newIntervals = {0,3};
        int[][] result = insert(intervals,newIntervals);
        for (int[] res : result) {
            System.out.println("["+ res[0] + "," + res[1] + "]");
        }
    }
}

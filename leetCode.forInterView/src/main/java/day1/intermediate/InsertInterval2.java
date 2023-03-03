package day1.intermediate;

public class InsertInterval2 {
        public static int[][] insert(int[][] intervals, int[] newInterval) {
            if(intervals.length==0){
                int[][] result = new int[1][2];
                result[0] =newInterval;
                return result;
            }
            int count = 0;
            int[][] result = new int[intervals.length+1][2];
            int start = newInterval[0];
            int end = newInterval[1];
              boolean inserted = false;
            boolean merged = false;
            for(int i =0; i<intervals.length; i++){
                int[] item = intervals[i];
                if(!inserted){
                    if(item[1]<start){
                        result[count] = item;
                        count++;
                    }
                    if(start<item[0] && end < item[0]){
                        int[] finalValue = {start,end};
                        result[count] = finalValue;
                        count++;
                        result[count] = item;
                        count++;
                        inserted = true;
                        continue;
                    }
                    if(!merged){
                        if(item[1]>= start){
                            if(item[1]>=end){
                                if(start>item[0]) start = item[0];
                                end = item[1];
                                int[] finalValue = {start,end};
                                result[count] = finalValue;
                                count++;
                                inserted = true;
                            }else{
                                if(start>item[0]) start = item[0];
                                merged = true;
                            }
                        }
                    }
                    else{
                        if(end >= item[0]){
                            if(end < item[1]) end = item[1];
                        }
                        else{
                         System.out.println(start);
                            int[] finalValue = {start,end};
                            result[count] = finalValue;
                            inserted = true;
                            count++;
                            result[count] = item;
                            count++;
                        }
                    }
                    if(!inserted && i==intervals.length-1){
                        int[] finalValue = {start,end};
                        result[count] = finalValue;
                        inserted = true;
                        count++;
                    }
                }else{
                    result[count] = item;
                    count++;
                }
            }
            int[][] finalResult = new int[count][2];
            for(int i =0; i<finalResult.length; i++){
                finalResult[i] = result[i];
            }
            return finalResult;
        }
    public static void main(String[] args) {
        //int[][] intervals = {{1,3},{6,9}};
        //int[][] intervals = {{1,5}};
        int[][] intervals = {{3,5},{6,7},{8,10},{12,16}};
        //int[] newIntervals = {4,8};
        int[] newIntervals = {0,2};
        int[][] result = insert(intervals,newIntervals);
        for (int[] res : result) {
            System.out.println("["+ res[0] + "," + res[1] + "]");
        }
    }
}

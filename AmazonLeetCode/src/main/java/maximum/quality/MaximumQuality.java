package maximum.quality;

import java.util.Arrays;

//https://leetcode.com/discuss/interview-question/1940397/amazon-online-assessment-find-the-maximum-quality-for-given-input-streamlist-over-n-channels
public class MaximumQuality {

    public static int highestQuality(int[] arr, int channel){
        Arrays.sort(arr);
        if(channel==1){
            return medium(arr,0,arr.length-1);
        }

        int traverse = arr.length-channel;
        int curMedium = medium(arr,0,traverse);

        while(++traverse<arr.length){
            curMedium+= arr[traverse];
        }

        return curMedium;

    }

    public static int medium(int[] arr, int start,int end){
        int length = end-start+1;
        if(length%2==0)
            return (arr[length/2]+arr[(length/2)+1])/2;
        return arr[length/2];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,6,1};
        int channel = 3;
        System.out.println(highestQuality(arr,channel));
    }
}

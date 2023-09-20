package array.question;

import javafx.util.Pair;

public class SubArraySum {
    //Two questions were asked. One was below medium question. Given an array of 1 and -1, return the maximum length of the subarray whose product is 1.
    //https://www.geeksforgeeks.org/amazon-interview-experience-for-sde-ii-july-2022/

    public static void main(String[] args) {
        int[] arr= {1,-1,-1,1,1,1,-1,1,1};
        int resLen = 0;
        for(int i=0;i<arr.length; i++){
            int product = 1;
            for(int j=i; j<arr.length;j++){
                product*= arr[j];
                if(product==1 && j-i>resLen){
                    resLen = j-i;
                }
            }

        }
        System.out.println(resLen);
    }
}

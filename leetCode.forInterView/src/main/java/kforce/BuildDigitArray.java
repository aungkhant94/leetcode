package kforce;

public class BuildDigitArray {


//    public static int[] getDigitArr(int num, int[] digits){
//
//
//
//    }

    public static void main(String[] args) {
        int sum = 0;
        int product = 1;

        int n = 123456;

        while(n>0){
            int res = n/10;
           int reminder =  n%10;
           sum  = sum+reminder;
           product = product* reminder;
           n = res;
        }

        System.out.println(product-sum);
    }
}

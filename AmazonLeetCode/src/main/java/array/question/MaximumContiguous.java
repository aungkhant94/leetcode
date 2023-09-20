package array.question;

public class MaximumContiguous {

    //https://www.geeksforgeeks.org/largest-sum-contiguous-increasing-subarray/
    public static int largestSum(int[] arr, int n){
        int result= 0;
        for(int i=0; i<n;i++){
            int sum = arr[i];
            while (i+1 < n && arr[i+1] > arr[i]){
                sum+= arr[i+1];
                i++;
            }
            if (sum>result)
                result = sum;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 4, 7, 3, 6 };
        int n = arr.length;
        System.out.println("Largest sum = "
                + largestSum(arr, n));
    }
}

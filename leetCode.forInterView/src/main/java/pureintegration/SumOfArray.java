package pureintegration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArray {


   public static void permute(List<List<Integer>> finalResult, List<Integer> rowResult,boolean[] used,int[] source){
       if(rowResult.size()==source.length){
           finalResult.add(new ArrayList<>(rowResult));
       }else{

            for(int i=0;i< source.length; i++){
                if(used[i])
                   continue;
               if(i>0 && source[i] == source[i-1] && !used[i-1])
                    continue;

                used[i] = true;
                rowResult.add(source[i]);
                permute(finalResult,rowResult,used,source);
                used[i] = false;
                rowResult.remove(rowResult.size()-1);
            }
       }
   }
    public static int getMaxSumOfArray(List<Integer> arr1, List<Integer> arr2){
        int[] array1 = arr1.stream().mapToInt(Integer::intValue).toArray();
        int[] array2 = arr2.stream().mapToInt(Integer::intValue).toArray();
        int result = Integer.MIN_VALUE;
        for(int i =0; i<array1.length;i++){
            for(int j=i; j<array1.length;j++){
                int[] swappedArr1 =  swap(array1,i,j);

                for (int k = 0; k < array1.length; k++) {
                    for (int l = k; l < array1.length; l++) {
                        int[] swappedArr2 = swap(array2, k, l);
                        System.out.print("\t " + Arrays.toString(swappedArr1) + "\t " + Arrays.toString(swappedArr2));
                        int sum = 0;
                        int newArr[] = new int[array1.length];
                        for(int m=0;m<array1.length;m++){
                            newArr[m] = (m+1)*(swappedArr2[m] - swappedArr1[m]);
                            sum += (m+1)*(swappedArr2[m] - swappedArr1[m]);
                        }
                        System.out.println("\t "+ Arrays.toString(newArr) + "\t "+sum);
                        if(sum > result){
                            result = sum;
                        }

                    }
                }

            }
        }
        return result;
    }

    public static int[] swap(int[] arr, int a, int b){
        int[] newArr = arr.clone();
        int temp = newArr[a];
        newArr[a] = newArr[b];
        newArr[b]  = temp;
        return newArr;
    }

    public static void main(String[] args) {
        List<Integer> lsit1 = new ArrayList<>();
        lsit1.add(1);
        lsit1.add(2);
        lsit1.add(3);
        //lsit1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(8);
        list2.add(4);
        list2.add(9);

        int[] arr = {};
                //arr1.stream().mapToInt(Integer::intValue).toArray();
        int[] arr2 = {};
                //arr2.stream().mapToInt(Integer::intValue).toArray();
       //int result =  getMaxSumOfArray(lsit1,list2);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<List<Integer>> res2 = new ArrayList<List<Integer>>();
         permute(res, new ArrayList<>(), new boolean[arr.length],arr);
         permute(res2,new ArrayList<>(), new boolean[arr2.length],arr2);
        System.out.println(Arrays.toString(res.toArray()));
        System.out.println(Arrays.toString(res2.toArray()));

        Integer result = Integer.MIN_VALUE;
        for(List<Integer> array1: res){

            for(List<Integer> array2: res2){

                int sum = 0;
                for(int i=0; i<array2.size();i++){
                    int element = (i+1)*(array2.get(i) - array1.get(i));
                    sum+= element;
                }
                if(sum > result)
                    result = sum;

            }
        }


        System.out.println(result) ;
    }
}

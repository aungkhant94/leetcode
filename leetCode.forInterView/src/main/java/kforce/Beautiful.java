package kforce;

import java.util.Arrays;

public class Beautiful{


    public static void main(String[] args) {
    String str = "aabbcc";

    char[] charArr = str.toLowerCase().toCharArray();
    Arrays.sort(charArr);

    int previousCount = Integer.MAX_VALUE;
    int count = 0;
    char previous = 'a';
    //char current;
    boolean isBeautiful = true;

    int index = 0;
    for(char c : charArr){
        if(previous==c && index!=charArr.length-1){
            count++;
        }else{
            if(index!=charArr.length-1) {
                int preInt = previous;
                previous = (char) (preInt + 1);
            }

            if(previousCount < count || previous!=c){
                isBeautiful = false;
                break;
            }

            previousCount = count;
            count = 1;
        }
        index++;
    }
        System.out.println(isBeautiful);

    }


}

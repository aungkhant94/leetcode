package infostrech;

import java.util.Stack;

public class UniqueString {


    public static boolean unquieCheck(String str){
        int[] fullCharSet = new int[256];
        for(char c : str.toCharArray()){
            int i = c;
            fullCharSet[i]++;
            if(fullCharSet[i]>1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        //System.out.println( unquieCheck("Helo"));
        checkconsequence("11100010");

    }


    public int check(String str){
        int one=0;
        int zero=0;
        int aster=0;
        for(char c: str.toCharArray()){
            if(c=='1'){
                one++;
            }else if(c=='0'){
                zero++;
            }else if(c=='*'){
                aster++;
            }
        }

        int res =  one-zero;
        if(res<0)
            res = res*(-1);

        return res+aster;

    }



    public static int checkconsequence(String str){
        char[] carr = str.toCharArray();
        int count = 0;
        for(int i=1; i<carr.length-1;i++){

                if(carr[i]=='0' && carr[i-1]=='1'){
                    count++;

                }
                if(carr[i]=='1' && carr[i-1]=='0'){
                    count++;
                }
        }
        int res = carr.length-(count*2);
        return res;
    }
}

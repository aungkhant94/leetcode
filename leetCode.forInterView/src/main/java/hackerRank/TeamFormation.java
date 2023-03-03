package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamFormation {



    static int nCr(int n,int r)
    {
            if(n==0 || r==0 || r==n)
                return 1;
            else {
                return nCr(1,r-1)+ nCr(n-1,r);
            }
    }
    public static int countTeams(List<Integer> list , int minPlayers, int minLevel, int maxLevel){
        int count =0 ;
        for (Integer number :list ){
            if (number >= minLevel && number <= maxLevel){
                count++;
            }
        }

        int totlaNumber=0;
        for (int i=minPlayers ; i<=count;i++){
            totlaNumber+= nCr(count,i);
        }
        return totlaNumber;
    }

    public static  void main (String[] args ){
        List<Integer> myList = Arrays.asList(12,4,6,13,5,10);
        System.out.println(countTeams(myList,2,4,10));
    }
}

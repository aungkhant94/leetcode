package string.questions;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubStrNonRepeat {

    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int left  = 0;
        int len = 0;
        for(int right=0; right<arr.length; right++){

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                if((right-left+1)> len)
                    len = right-left+1;
            }else{

                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(left);
                set.add(s.charAt(right));
                left++;

            }

        }
        return len;
    }
}

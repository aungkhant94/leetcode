package string.questions;


import java.util.List;

//https://leetcode.com/problems/word-break/description/
public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        String newStr;
        if(wordDict.size()==0) {
            return true;
        }
        if (s.contains(wordDict.get(0))){
            newStr = s.replace(wordDict.get(0),"");
            wordDict.remove(0);
            return true & wordBreak(newStr,wordDict);
        }
        return false;
    }

    public static void main(String[] args) {
        
    }
}

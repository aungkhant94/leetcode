package leetcode.practical.medium;


import java.util.Arrays;

public class Anagram {

    //Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    //An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
    //https://leetcode.com/problems/valid-anagram/description/
    public boolean checkAnagram(String str1, String str2){
         char[] chArr1 = str1.toCharArray();
         char[] chArr2= str2.toCharArray();
         Arrays.sort(chArr1);
         Arrays.sort(chArr2);
         if(chArr1.length!=chArr2.length)
             return false;
         boolean isAnagram = true;
         for (int i= 0; i<chArr1.length;i++){
             if (chArr1[i]!=chArr2[i]){
                 isAnagram = false;
                 break;
             }
         }
        return isAnagram;
    }



}

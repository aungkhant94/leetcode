package leetcode.practical.medium;

public class StringProblems {

    /**
     * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
     *
     * The algorithm for myAtoi(string s) is as follows:
     *
     * Read in and ignore any leading whitespace.
     * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
     * Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
     * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
     * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
     * Return the integer as the final result.
     * Note:
     *
     * Only the space character ' ' is considered a whitespace character.
     * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
     *
     * https://leetcode.com/problems/string-to-integer-atoi/description/
     */
    public int myAtoi(String s) {
        char[] chArr = s.toCharArray();
        int sign = 1;
        long num = 0;
        for(char ch: chArr){
            if(ch!=' '){
                if(ch=='-') {
                    sign = -1;
                }else if (ch>='1' && ch<='9' ) {
                    num *=10;
                    num+= ch;
                    if(num>Integer.MAX_VALUE)
                        return sign*Integer.MAX_VALUE;
                }
            }
        }
        return (int)(sign*num);
    }
}
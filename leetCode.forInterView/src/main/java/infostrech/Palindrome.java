package infostrech;

public class Palindrome {
    static int count = 0;

    public static String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        int start = 0, end =0;
        for(int i = 0; i<str.length; i++) {
            int even = expandFromIndex(i, i+1, str);
            int odd = expandFromIndex(i, i, str);
            int len = Math.max(even, odd);
            if(len > end - start) {
                start = i - (len-1)/2;
                end = i + (len/2);
            }
        }
        return s.substring(start, end+1);
    }

    public static int palindromeCount(String s) {
        char[] str = s.toCharArray();
        int start = 0, end =0;
        int count = 0;
        for(int i = 0; i<str.length; i++) {

            int l=i,r = i+1;
            if(str.length%2!=0)
                l=i-1; r =i+1;
            while(l>=0 && r < str.length && str[l] == str[r]) {
                System.out.println(str[l]+"\t" +str[r]);
                    count++;
                l--;
                r++;
            }
//            l=i; r=i+1;
//            while(l>=0 && r < str.length && str[l] == str[r]) {
//                l--;
//                r++;
//                evenCount++;
//            }
        }

        return count;
    }


    private static int expandFromIndex(int l, int r, char[] s) {

        if(s==null || l>r) return 0;
        while(l>=0 && r < s.length && s[l] == s[r]) {
            l--;
            r++;
        }
        return r-l-1;
    }

    public static void main(String[] args) {
        String str= "aabbc";
        System.out.println(  palindromeCount(str));

    }
}

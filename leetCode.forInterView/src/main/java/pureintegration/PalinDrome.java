package pureintegration;

public class PalinDrome {


    public static boolean isPalindrome(String str)
    {
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    static int longestPlaSubStr2(String str, int k){
        char[] carr = str.toCharArray();
        int count = 0;
        int i = 0;
        String pal = "";
        while(i<carr.length){
            pal = pal+ carr[i];
            System.out.println(pal);
            if(isPalindrome(pal) && pal.length()>=k){
                System.out.println("Palim=" + pal);
                count++;
                pal = "";
            }else{
                if(pal.length()>=k ){
                    pal = "";
                    i = i-pal.length()-2;
                }else{

                }
            }
            i++;
        }
        return  count;
    }

    static int longestPalSubstr(String str)
    {
        int n = str.length();

        int maxLength = 1, start = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;
                for (int k = 0; k < (j - i + 1) / 2; k++) {
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;
                }
                if (flag!=0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "aababaabce";
        System.out.println( longestPlaSubStr2(s,3));
    }
}

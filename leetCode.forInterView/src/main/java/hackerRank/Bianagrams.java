package hackerRank;

public class Bianagrams {
    public static boolean bianagrams(String word1, String word2) {
        int[] w1 = new int[128];
        int[] w2 = new int[128];
        int count = 0;
        for(int i=0; i<word1.length(); i++) {
            w1[word1.charAt(i)] += 1;
            w2[word2.charAt(i)] += 1;
        }
        for(int i=0; i<w1.length; i++) {
            if(w1[i] != w2[i]) count++;
        }
        System.out.println(count);
        return count == 2;
    }

    public static void main(String[] args) {

    }
}

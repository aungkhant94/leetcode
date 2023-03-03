package hackerRank;

public class JumpToTheFlag {
    public static int jumpToTheFlag(int k, int j) {
        if(k==0) return 0;
        if(j==0) return k;
        return (k-((k/j)*j)) + ((k/j)*j)/j;
    }
}

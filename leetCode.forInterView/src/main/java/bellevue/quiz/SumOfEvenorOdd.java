package bellevue.quiz;

public class SumOfEvenorOdd {

    public static int f(int n){
        if(n==0 || n==1) return n;
        return n+f(n-2);
    }
    public static void main(String[] args) {
        System.out.println(f(2));

        String str = "010100011";
         int index= str.indexOf('0');

         char c = str.charAt(0);
        
    }
}

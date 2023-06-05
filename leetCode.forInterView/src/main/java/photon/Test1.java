package photon;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Test1 {

    //Input: 142454
    //
    //Output: The digit 4 occurs 3 times in 142454

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.next();
        String cha = s.next();

//        char[] textChar = text.toCharArray();
//        char[] chaChar = cha.toCharArray();
//        int count = 0;
//        for(char c: textChar){
//            if(c== chaChar[0]){
//                count++;
//            }
//        }
        Integer number = Integer.parseInt(text);
        Integer num = Integer.parseInt(cha);
//        Stack<Integer> stack =  getIntArray(number, new Stack<>());
//        int count =0;
//        for(Integer n : stack){
//            if (n==num){
//                count++;
//            }
//        }
        int count = countDigitFreq(number,num);
        System.out.println("The digit "+num+" occurs "+count+" times in "+text);
    }


    private static Stack<Integer> getIntArray(Integer number, Stack<Integer> integerStack){

        if(number>10) {
            int num = number / 10;
            int reminder = number % 10;
            integerStack.push(reminder);
            getIntArray(num, integerStack);
        }
        return integerStack;
    }
    public static int countDigitFreq(int n,int D) {
        if(n == 0 && D == 0) return 1; //number 0 has 1 frequency of 0
        //if a negative number is entered
        if(n < 0) n = -n;
        int counter = 0;
        while(n != 0) {
            int digit = n % 10; //calculate the digit
            if(digit == D) counter++;
            n = n/10;
        }
        return counter;
    }


}

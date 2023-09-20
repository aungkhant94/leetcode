package valid.parentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://leetcode.com/discuss/interview-question/1763853/amazon-oa-find-valid-discount-coupons
public class ValidCoupon {
    public static void main(String[] args) {
        List<String> list = Stream.of("abba", "abca", "abbacbbc", "aabb", "xaaxybbyzccz", "vaas", "jay").collect(Collectors.toList());
        System.out.println(findValidDiscountCoupons(list));
    }

    // wrong answer , see below
    //https://leetcode.com/playground/f7XtpKsy
    public static List<Integer> findValidDiscountCoupons(List<String> discounts){
        List<Integer> resList = new ArrayList<>();
        for(String str : discounts){
            int result = 1;
            char[] chArr = str.toCharArray();
            int i = 0;
            int j = chArr.length-1;
            while (i<=j){
                System.out.print(chArr[i] +" , "+ chArr[j]);
                if(chArr[i]!=chArr[j]){
                    result = 0;
                }

                i++;
                j--;
            }
            resList.add(result);
            System.out.println("");
        }
        return resList;
    }
}

package hackerRank;

import java.util.Arrays;
import java.util.List;

public class PriceCheck {
    public static void main(String[] args) {
        List<String> products = Arrays.asList("eggs", "milk", "cheese");
        List<Float> productPrices = Arrays.asList(2.89F, 3.29F, 5.79F);
        List<String> productSold = Arrays.asList("eggs", "eggs", "cheese", "milk");
        List<Float> soldPrices = Arrays.asList(2.89F, 2.99F, 5.97F, 3.29F);
        int result = priceCheck(products, productPrices, productSold, soldPrices);
        System.out.println(result);
    }

    public static int priceCheck(List<String> products, List<Float> productPrices,
                                 List<String> productSold, List<Float> soldPrices) {
        int i = 0;
        int count = 0;
        for(String soldProduct : productSold) {
            if(Float.compare(soldPrices.get(i), productPrices.get(products.indexOf(soldProduct))) != 0) {
                count++;
            }
            i++;
        }
        return count;
    }
}

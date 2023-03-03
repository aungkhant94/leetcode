package fordIT;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class PriceCheck {

    public int priceCheck(List<String> products, List<Float> productPrices, List<String> productSold, List<Float> soldPrice){
        int error = 0;
        HashMap<String, Float> priceByProd = new HashMap<>();
        for(int i=0; i<products.size();i++){
            String productName = products.get(i);
            Float productPrice = productPrices.get(i);

            priceByProd.put(productName,productPrice);

        }

        for(int j=0; j<productSold.size();j++){
            if(!priceByProd.get(productSold.get(j)).equals(soldPrice.get(j))){
                error++;
            }
        }
        return error;
    }

    public static void main(String[] args) {


        List<Integer> compIntegers = new ArrayList<>();
        
    }
}

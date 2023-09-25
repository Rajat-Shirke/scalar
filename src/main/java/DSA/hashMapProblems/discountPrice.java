package DSA.hashMapProblems;
import java.util.*;

public class discountPrice {
    public static int findLowestPrice(List<List<String>> products, List<List<String>> discounts) {

        int minsum =0;
        HashMap<String, AbstractMap.SimpleEntry<Integer,Integer>> discMap = new HashMap<>();
        for (int i = 0; i < discounts.size(); i++) {
            discMap.put(discounts.get(i).get(0),new AbstractMap.SimpleEntry<>(Integer.parseInt(discounts.get(i).get(1)),Integer.parseInt(discounts.get(i).get(2))));
        }
        for (List<String> product : products) {

            double product_price = Integer.parseInt(product.get(0));
            int finalDiscPrice =(int)product_price;
            for (int j = 1; j < product.size(); j++) {
                int discPrice=(int)product_price;
                String discName=product.get(j);
                if(!Objects.equals(discName, "EMPTY"))
                {
                    AbstractMap.SimpleEntry<Integer, Integer> val = discMap.get(discName);
                    if(val.getKey()==0)
                    {
                        discPrice= val.getValue();
                    } else if (val.getKey()==1) {
                        double priceTemp = product_price-(product_price*((double) val.getValue() /100));
                        discPrice = (int) Math.round(priceTemp);
                    }
                    else
                    {
                        discPrice = (int) Math.round(product_price- (double)val.getValue());
                    }

                }
                finalDiscPrice=Integer.min(finalDiscPrice,discPrice);

            }
            minsum+=finalDiscPrice;
        }

        return minsum;
    }
}

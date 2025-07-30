
import java.util.HashMap;

public class HashMAapExample {
    
    public static void main(String[] args){

        HashMap<String,Double> product = new HashMap<>();

        product.put("apple",0.50);
        product.put("orange",1.50);
        product.put("grape",0.70);
        product.put("banana",0.25);
        product.put("lemon",0.60);

        for (String prod : product.keySet()){
            System.out.println(prod + " : " + product.get(prod));
        }

        product.remove("lemon");

       System.out.println(product.containsKey("lemon"));
       System.out.println(product.containsValue(1.50));
       System.out.println(product.size());
    }
}

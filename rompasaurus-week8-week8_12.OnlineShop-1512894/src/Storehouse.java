import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


public class Storehouse {
    //private String product;
    //private int price;
    //private int stock;
    private Map<String,Integer> prices = new HashMap<String,Integer>();
    private Map<String,Integer> stock = new HashMap<String,Integer>();
    

    
    
    public void addProduct(String product,int price,int stock){
        prices.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        if(prices.containsKey(product)){
            return prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product){
        if(stock.containsKey(product)){
            return stock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product){
        if(stock(product)>0){
            stock.put(product, stock.get(product)-1);
            return true;
        }
        return false;
        
    }
    
    public Set<String> products(){
        Set<String> products = new HashSet<String>();
        for(String product: stock.keySet()){
            products.add(product);
           
        }
        return products;
    }
    
    
}

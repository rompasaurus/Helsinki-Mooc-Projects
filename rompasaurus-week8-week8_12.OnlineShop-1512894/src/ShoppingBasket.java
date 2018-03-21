import java.util.ArrayList;
import java.util.List;


public class ShoppingBasket {
    private List<Purchase> purchases = new ArrayList<Purchase>();
    
    public void add(String product,int price){
        for(Purchase purchases: purchases){
            if(purchases.name().equals(product)){
                purchases.increaseAmount();
                return;
            }
        }
        
        Purchase purchase = new Purchase(product,1,price);
        purchases.add(purchase);
    }
    public int price(){
        int price=0;
        for(Purchase purchase:purchases){
            price+=purchase.price();
        }
        return price;
    }
    public void print(){
        for(Purchase purchases: purchases){
            System.out.println(purchases);
        }

    }
}

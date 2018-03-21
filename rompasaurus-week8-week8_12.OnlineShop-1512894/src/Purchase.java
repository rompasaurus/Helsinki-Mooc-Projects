
public class Purchase {
    private String product;
    private int amount;
    private int unitPrice;
    
    public Purchase(String product, int amount, int unitPrice){
        this.amount=amount;
        this.product=product;
        this.unitPrice=unitPrice;
    }
    public int price(){
        return amount*unitPrice;
        
    }
    public void increaseAmount(){
        amount++;        
    }
    public String toString(){
        return product +": "+amount;
    }
    public String name(){
        return this.product;
    }
}

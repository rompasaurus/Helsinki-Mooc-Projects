package containers;

public class ProductContainer extends Container {
    private String name;

    public ProductContainer(String productName, double capacity){
        super(capacity);
        this.name = productName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": "+super.toString() ;
    }

    public void setName(String name) {
        this.name = name;
    }
}

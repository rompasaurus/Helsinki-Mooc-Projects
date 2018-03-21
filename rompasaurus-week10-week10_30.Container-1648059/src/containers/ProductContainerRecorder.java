package containers;

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory cHist;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume){
        super(productName,capacity);
        cHist = new ContainerHistory();
        this.addToTheContainer(initialVolume);
    }
    public String history(){
        return cHist.toString();
    }

    @Override
    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        cHist.add(this.getVolume());
    }

    @Override
    public double takeFromTheContainer(double amount) {
        double taken = super.takeFromTheContainer(amount);
        cHist.add(this.getVolume());
        return taken;
    }
    public void printAnalysis(){
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + cHist.maxValue());
        System.out.println("Smallest product amount: " + cHist.minValue());
        System.out.println("Average: " + cHist.average());
        System.out.println("Greatest change: " + cHist.greatestFluctuation());
        System.out.println("Variance: " + cHist.variance());

    }
}

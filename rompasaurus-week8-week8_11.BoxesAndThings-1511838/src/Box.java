import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> box = new ArrayList<ToBeStored>();
    //private double weight;
    
    public Box(double maxWeight){
        this.maxWeight=maxWeight;
    }
    public void add(ToBeStored tBS){
        if(this.weight()<maxWeight-tBS.weight()){
        box.add(tBS);
        }
        
    }
    public String toString(){
        return "Box: "+box.size()+" things, total weight "+this.weight()+" kg";
    }
    public double weight(){
        double weight = 0;
        for(ToBeStored tBS:box){
            weight+=tBS.weight();
        }
        return weight;
    }
            
    
    
}

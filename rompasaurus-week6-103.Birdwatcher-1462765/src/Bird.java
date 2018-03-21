
public class Bird {
    private String name;
    private String latinName;
    private int observations;
    
    public Bird(String name, String latinName){
        this.name=name;
        this.latinName=latinName;
    }
    public String getName(){
        return this.name;
    }
    public String getLatinName(){
        return this.latinName;
    }
    public void observe(){
        this.observations++;
    }
    public int getObservations(){
        return observations;
    }
    
}

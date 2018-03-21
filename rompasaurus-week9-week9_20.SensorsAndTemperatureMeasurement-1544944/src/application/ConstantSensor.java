package application;

public class ConstantSensor implements Sensor{
    private int param;
    
    
    public ConstantSensor(int param){
        this.param = param;
    }
    public boolean isOn(){
        return true;
    }  // returns true if the sensor is on
    public void on(){
        
    }       // switches the sensor on
    public void off(){
        
    }      // switches the sensor off
    public int measure(){
        return this.param;
    }  
}

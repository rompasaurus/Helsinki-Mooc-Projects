package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean powerStatus = false;

    public boolean isOn(){
        return powerStatus;
    }  // returns true if the sensor is on
    public void on(){
        this.powerStatus=true;
    }       // switches the sensor on
    public void off(){
        this.powerStatus=false;        
    }      // switches the sensor off
    public int measure(){
        Random rand = new Random();
        if(this.isOn()){
            return rand.nextInt(60)+(-30);
        }
        throw new IllegalStateException();
    }  
}

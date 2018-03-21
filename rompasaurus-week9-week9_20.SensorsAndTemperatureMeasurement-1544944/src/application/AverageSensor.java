package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors = new ArrayList<Sensor>();
    private List<Integer>readings = new ArrayList<Integer>();

    public boolean isOn(){
        boolean on = true;
        for(Sensor sensor:sensors){
            if(!sensor.isOn()){
               on=false; 
            }
        }
        if(sensors.isEmpty()){
            return false;
        }
        return on;
    }  // returns true if the sensor is on
    public void on(){
        for(Sensor sensor:sensors){
            sensor.on();
        }
    }       // switches the sensor on
    public void off(){
        for(Sensor sensor:sensors){
            sensor.off();
        }
    }      // switches the sensor off
    public int measure(){
        int average = 0;
        if(!this.isOn()){
            throw new IllegalStateException("average sensor error");
        }
        for(Sensor sensor: sensors){
            average+=sensor.measure();
        }
        average=average/sensors.size();
        readings.add(average);  
        return average;
    }

    public void addSensor(Sensor additional){
        sensors.add(additional);
    } 
    
    public List<Integer> readings(){
        return readings;
    }
}

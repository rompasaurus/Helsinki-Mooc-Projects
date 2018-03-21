
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class VehicleRegister {
 private HashMap<RegistrationPlate, String> owners = new HashMap<RegistrationPlate, String>();
    
    
    public boolean add(RegistrationPlate plate, String owner){
       if(owners.get(plate)!=null){
           return false;
       }
       owners.put(plate,owner);
       return true;
       
        }
    public String get(RegistrationPlate plate){
        return owners.get(plate);
    }
    public boolean delete(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        }
        return false;
    }
    public void printRegistrationPlates(){
        for (RegistrationPlate key : owners.keySet()){
            System.out.println(key);
        }
    }
    public void printOwners(){
        ArrayList<String>owner = new ArrayList<String>();
        for (RegistrationPlate key : owners.keySet()){
            if(!owner.contains(owners.get(key))){
                owner.add(owners.get(key));
                System.out.println(owners.get(key));
            }
            
        }
    }
}

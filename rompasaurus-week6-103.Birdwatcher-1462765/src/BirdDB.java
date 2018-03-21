import java.util.ArrayList;

public class BirdDB {
    private ArrayList<Bird> birdList=new ArrayList<Bird>();
    
    public void addBird(Bird bird){
        birdList.add(bird);
    }
    public boolean isBird(String name){
        String trimName= name.toUpperCase().trim();
        for(Bird bird:birdList){
            String trimBirdName= bird.getName().toUpperCase().trim();
            if(trimBirdName.contains(trimName)){
                bird.observe();
                return true;
            }
        }
        return false;
    }
    public void printBirdStats(String name){
        String trimName= name.toUpperCase().trim();
        for(Bird bird:birdList){
            String trimBirdName= bird.getName().toUpperCase().trim();
            if(trimBirdName.contains(trimName)){
                System.out.println(bird.getName()+" ("+bird.getLatinName()+"): "+bird.getObservations()+" observations");
            }
        }
    }
    public void printBirdStats(){
        for(Bird bird:birdList){
            printBirdStats(bird.getName());
        }
    }
    
    
    
}

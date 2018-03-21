import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
    private Map<Bird,List<String>> observations = new HashMap<Bird,List<String>>();

    public void observe(Bird bird, String place) {
        List<String> places = new ArrayList<String>();
        if (observations.containsKey(bird)) {
            places = observations.get(bird);
            places.add(place);
        }else{
            places.add(place);
            observations.put(bird, places);
        }

    }

    public void observations(Bird bird) {
        if (observations.containsKey(bird)) {
            System.out.println(bird+" observations: "+ observations.get(bird).size());
            for(String place: observations.get(bird)){
                System.out.println(place);
            }
        }else{
            System.out.println(bird+" observations: 0");
        }
    }
}

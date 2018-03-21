package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {
    private List<Double> history;

    public ContainerHistory(){
        history = new ArrayList<Double>();
    }

    public void add(double situation){
        history.add(situation);
    }

    public void reset(){
        history.clear();
    }

    @Override
    public String toString(){
       return "" + history;
    }

    public double maxValue(){
        return Collections.max(history);
    }

    public double minValue(){
        return Collections.min(history);
    }

    public double average(){
        double average = 0;
        for (double value : history) {
            average += value;
        }
        if (history.isEmpty()) {
            return average;
        }
        return average/history.size();
    }

    public double greatestFluctuation() {
        double currentHighestFluctuation = 0;
        double currentFluctaution = 0;
        for (int i = 0; i < history.size() - 1; i++) {
            currentFluctaution = Math.abs(history.get(i) - history.get(i + 1));
            if (currentFluctaution > currentHighestFluctuation) {
                currentHighestFluctuation = currentFluctaution;
            }
        }
        return currentHighestFluctuation;
    }

    public double variance(){
        double variance = 0;
        for (int i = 0; i < history.size(); i++){
            variance+=Math.pow(history.get(i)-average(),2);
        }
        return variance/(history.size()-1);
    }

}

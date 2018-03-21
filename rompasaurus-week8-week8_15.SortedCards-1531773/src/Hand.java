import java.util.ArrayList;
import java.util.Collections;


public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand = new ArrayList<Card>();

    public void sort(){
        Collections.sort(hand);
    }

    public int compareTo(Hand hand){
        return this.handValue() -hand.handValue();
    }
    public void add(Card card){
        hand.add(card);
    }

    public void print(){
        for(Card card:hand){
            System.out.println(card);
        }

    }
    public int handValue(){
        int valThat=0;
        for(Card card:hand){
            valThat += card.getValue();
        }
        return valThat;
    }

    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(hand, suitSorter );
        //Collections.sort(hand);
    }
}

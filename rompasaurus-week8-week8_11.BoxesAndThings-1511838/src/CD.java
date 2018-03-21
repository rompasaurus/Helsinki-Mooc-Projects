
public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight=.1;
    
    public double weight(){
        return weight;
    }
    public CD(String artist, String title,int publishingYear){
        this.artist=artist;
        this.title=title;
        this.publishingYear=publishingYear;
        
    }
    public String toString(){
        return artist + ": "+title+" ("+publishingYear+")";
    }
}

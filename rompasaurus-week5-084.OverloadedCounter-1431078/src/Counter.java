
public class Counter {
    private int counter;
    private boolean check=false;
    
    public Counter(int startingValue, boolean check){
        this.check=check;
        this.counter=startingValue; 
    }
    
    public Counter(int startingValue){
        this.counter=startingValue;
    }
    
    public Counter(boolean check){
        this.check=true;
        //this.counter=0;
    }

    public Counter(){

    }
    
    public int value(){
        return this.counter;
    }
    
    public void decrease(){
       // if(!this.check||(this.check&&this.counter>0)){
       // this.counter--;        
       // }
       this.decrease(1);
    }

    public void decrease(int decreaseAmount){
        if(decreaseAmount>0){
            if(!this.check||(this.check&&this.counter>decreaseAmount)){
            this.counter-=decreaseAmount;        
            }else{
            this.counter=0;
            }
        }
    }

  
    public void increase(){
        this.counter++;
    }

    public void increase(int increaseAmount){
        if(increaseAmount>0){
            this.counter+=increaseAmount;
        }
    }
    
    public String toString(){
        return ""+counter+" "+check;
    }
    
}

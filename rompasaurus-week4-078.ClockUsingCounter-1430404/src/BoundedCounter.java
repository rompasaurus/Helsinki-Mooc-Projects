public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit=upperLimit;
    }

    public void next() {
        if(this.value<this.upperLimit){
            this.value++;
        }else{
            this.value=0;
        }
    }

    public String toString() {
        if(this.value<10){
            return "0"+value;
        }
        return ""+this.value;
    }

    public int getValue(){
        return this.value;
    }

    public void setValue(int value){
        if (value >= 0&&value<=upperLimit) {
            this.value=value;
                }

    }
}
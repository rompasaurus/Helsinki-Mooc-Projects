public class Main {
    public static void main(String[] args) {
        Counter countalator=new Counter();
        System.out.println(countalator);
        countalator.decrease();
        System.out.println(countalator);
        Counter counter=new Counter(25,true);
        System.out.println(counter);
        counter.decrease();
        System.out.println(counter);
        counter.decrease(34);
        System.out.println(counter);
    }
}

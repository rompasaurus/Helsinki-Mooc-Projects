import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    private int day =   Calendar.getInstance().get(Calendar.DATE);
    private    int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
    private int year=   Calendar.getInstance().get(Calendar.YEAR);
    private MyDate currentDate   = new MyDate(day,month,year);
        
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        this.name = name;
        this.birthday = currentDate;
    }
    
    
    public int age() {

        return birthday.differenceInYears(currentDate);
    }
      
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
    
    public boolean olderThan(Person compared){
        return this.birthday.earlier(compared.birthday);
    }
}
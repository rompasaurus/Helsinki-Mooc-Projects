package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name==null){
            throw new IllegalArgumentException("yo shit is fecked up");
        }
        
        if(age<0||age>120||name.length()>40||name.length()==0||name ==null){
            throw new IllegalArgumentException("yo shit is fecked up");
        }
        
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

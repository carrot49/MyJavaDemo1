package Function.Eight;

public class person {

    String name;
    int age;

    person(){}

    person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "The person name is " + name + ",and age is " + age;
    }

}

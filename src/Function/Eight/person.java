package Function.Eight;

import java.lang.String;

public class person implements Comparable{

    String name;
    String age;
    int number;

    person(){}

    person(int number){
        this.number = number;
    }

    person(String name, int number){
        this.number = number;
        this.name = name;
    }

    person(String name,String age,int number){
        this.name = name;
        this.age = age;
        this.number = number;
    }

    @Override
    public String toString() {
        return "The person name is " + name + ",and age is " + age + ",and the number is " + number;
    }

    @Override
    public int hashCode() {
        return age.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof person) {
            person empP1 = (person) obj;
            if (empP1.age.equals(this.age) && empP1.name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Object o) {
        int reNumber1 = this.number;
        int reNumber2 = ((person)o).number;
        return reNumber1-reNumber2;
    }

}

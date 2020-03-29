package Function.Eight;

public class person {

    String name;
    String age;

    person(){}

    person(String name,String age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "The person name is " + name + ",and age is " + age;
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
}

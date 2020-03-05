package Function.Four;

public class Person {

    public String name = "zhangsan";

    public void feeds(Pets p){
        System.out.print(name + " is feeding ");
        p.eat();
    }

    @Override   //Object的toString方法重写
    public String toString(){
        return "The person, "+ name +", is the master";
    }
}

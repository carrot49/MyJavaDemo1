package Function.Four;

public class function_four {

    public static void bassic_function(){
        Pets p2 = new Pets();
        Pets p3 = new Dogs();
        Pets p4 = new Cats();

        Person p1 = new Person();

        p2.eat();
        p3.eat();
        p4.eat();

        p1.feeds(p3);

        System.out.println(p1);
    }
}

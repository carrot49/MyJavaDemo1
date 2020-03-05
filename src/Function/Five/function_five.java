package Function.Five;

public class function_five {

    public static void bassic_function(){
        String s1 = new String("ABC");
        String s2 = new String("ABC");

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));

        people p1 = new people("yyz",20);
        people p2 = new people("yyz",20);
        people p3 = new people("yyz",21);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
    }

}

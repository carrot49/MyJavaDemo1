package Function.Five;

/**
 * @author carrot
 */
public class function_five {

    public static void bassic_function(){
        //String s1 = "xxx"; 只会在字符串常量池中创建一个“abc”字符串对象(常用)
        //String s2 = new String("hello"); 会在字符串常量池中创建一个“hello”字符串对象，并且会在堆中再创建一个字符串对象(浪费内存！！！)
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

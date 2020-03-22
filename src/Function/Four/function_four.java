package Function.Four;

public class function_four {

    public static void bassic_function(){
        Pets p2 = new Pets();
        Pets p3 = new Dogs();
        Pets p4 = new Cats();

        Pets as[]= new Pets[4];
        Pets d1 = new Dogs();
        Pets d2 = new Dogs();
        Pets c1 = new Cats();
        Pets c2 = new Cats();
        as[0]=d1;
        as[1]=d2;
        as[2]=c1;
        as[3]=c2;

        Person p1 = new Person();

        p2.eat();
        p3.eat();
        p4.eat();

        p1.feeds(p3);

        System.out.println(p1);

        //强制类型转换
        for(int i=0;i<as.length;i++){
            if(as[i] instanceof Dogs){
                Dogs d = (Dogs)as[i];
                d.eat();
            }else if(as[i] instanceof Cats){
                Cats c = (Cats)as[i];
                c.eat();
            }
        }


        //六种字符串常用方法
        String s1 = "abc";

        String s2 = new String("abc");

        byte[] bytes = {97,98,99,100};
        String s3 = new String(bytes);
        System.out.println(s3);

        String s4 = new String(bytes,1,2);

        char[] cc1 = {'a','b','c','d','e'};
        String s5 = new String(cc1);

        String s6 = new String(cc1,1,2);
    }
}

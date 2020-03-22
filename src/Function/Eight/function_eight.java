package Function.Eight;

import java.util.*;

/**
 * @author carrot
 */

public class function_eight {

    public static void bassic_function(){

        Collection c1 = new ArrayList();
        person p1 = new person("yyz",20);
        person p2 = new person("yyz",21);
        person p3 = new person("yyz",22);
        c1.add(p1);
        c1.add(p2);
        c1.add(p3);

        System.out.println(p2);
        System.out.println(c1.size());

        Object[] obj1 = c1.toArray();
        for(int i =0;i<obj1.length;i++) {
            System.out.println(obj1[i]);
        }

        System.out.println("迭代器：");
        Iterator it1 = c1.iterator();

        /*
        while ((it1.hasNext())){
            Object returnElement = it1.next();
            System.out.println(returnElement);
        }
        */

        for(Iterator it2 = c1.iterator();it2.hasNext();){
            Object o2 = it2.next();
            System.out.println(o2);
        }
    }

}

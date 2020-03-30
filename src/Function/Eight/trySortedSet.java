package Function.Eight;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.reflect.generics.tree.Tree;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class trySortedSet {

    public static void createSortedSet(){
        SortedSet ss = new TreeSet();

        person p1 = new person(121);
        person p2 = new person(123);
        person p3 = new person(124);

        ss.add(p1);
        ss.add(p2);
        ss.add(p3);

        System.out.println("\n");
        System.out.println("SortedSet:");
        System.out.println(ss.size());

        Iterator testEmpit = ss.iterator();
        while (testEmpit.hasNext()){
            Object testEmpReturn = testEmpit.next();
            System.out.println(testEmpReturn);
        }
    }

}

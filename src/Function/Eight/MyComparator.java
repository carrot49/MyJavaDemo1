package Function.Eight;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MyComparator {

    public static void createComparator() {
        SortedSet products = new TreeSet(new productComparator());

        Product p1 = new Product(4.5);
        Product p2 = new Product(6.5);
        Product p3 = new Product(3.3);

        products.add(p1);
        products.add(p2);
        products.add(p3);

        System.out.println("\n");
        System.out.println("My Comparator:");

        Iterator itComp = products.iterator();
        while (itComp.hasNext()){
            Object reitComp = itComp.next();
            System.out.println(reitComp);
        }
    }

}

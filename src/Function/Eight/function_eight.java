package Function.Eight;

import java.util.*;

/**
 * @author carrot
 */

public class function_eight {

    public static void bassic_function(){

        List l1 = new ArrayList();
        Collection c1 = new ArrayList();
        Set s1 = new HashSet();

        person p1 = new person("yyz","20",110);
        person p2 = new person("yyz","21",115);
        person p3 = new person("yyz","22",130);

        c1.add(p1);
        c1.add(p2);
        c1.add(p3);

        l1.add(p1);
        l1.add(p2);
        l1.add(p3);

        s1.add(p1);
        s1.add(p2);
        s1.add(p3);

        System.out.println(p2);
        System.out.println(c1.size());

        Object[] obj1 = c1.toArray();
        for(int i =0;i<obj1.length;i++) {
            System.out.println(obj1[i]);
        }

        System.out.println("\n");

        System.out.println("迭代器：");

        System.out.println("List return(1):");
        Iterator it1 = l1.iterator();
        while ((it1.hasNext())){
            Object returnElement = it1.next();
            System.out.println(returnElement);
        }
        System.out.println("\n");

        System.out.println("List return(2):");
        for(int i = 0;i<l1.size();i++){
            Object element = l1.get(i);
            System.out.println(element);
        }
        System.out.println("\n");

        System.out.println("List return(3):");
        for(Iterator it2 = c1.iterator();it2.hasNext();){
            Object o2 = it2.next();
            System.out.println(o2);
        }
        System.out.println("\n");

        System.out.println("Hash return:");
        Iterator it3 = s1.iterator();
        while (it3.hasNext()){
            Object hashReturn = it3.next();
            System.out.println(hashReturn);
        }

        tryhashCode.createAndFindEmp();
        trySortedSet.createSortedSet();
        MyComparator.createComparator();

    }

}

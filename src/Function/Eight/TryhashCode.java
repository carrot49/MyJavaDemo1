package Function.Eight;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TryhashCode {

    public static void createAndFindEmp(){

        Set emp = new HashSet();

        person emp1 = new person("cjh","21");
        person emp2 = new person("cjh","22");
        person emp3 = new person("cjh","23");
        person emp4 = new person("cjh","23");

        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);

        System.out.println("\n");
        System.out.println(emp.size());
        System.out.println(emp3.hashCode());
        System.out.println(emp4.hashCode());
        System.out.println("hashCode Override return:");

        Iterator itEmp = emp.iterator();
        while (itEmp.hasNext()){
            Object empReturn = itEmp.next();
            System.out.println(empReturn);
        }
    }

}

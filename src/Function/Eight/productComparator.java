package Function.Eight;

import java.util.Comparator;

public class productComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        double price1 = ((Product)o1).price;
        double price2 = ((Product)o2).price;
        if(price1 == price2){
            return 0;
        }else if(price1>price2){
            return 1;
        }else {
            return -1;
        }
    }

}

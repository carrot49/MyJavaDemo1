package Function.Eight;

public class Product {

    double price;

    Product(){

    }

    Product(double price){
        this.price = price;
    }

    @Override
    public String toString(){
        return "price:" + price;
    }

}

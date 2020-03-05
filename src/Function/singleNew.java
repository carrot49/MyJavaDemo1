package Function;

public class singleNew {

    private static user_data s;

    private singleNew(){}

    public static user_data getsingleNew(){
        if(s==null){
            s= new user_data();
        }
        return s;
    }
}


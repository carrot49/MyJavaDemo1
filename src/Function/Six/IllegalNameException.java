package Function.Six;

import java.lang.Exception;

public class IllegalNameException extends Exception{

    //编译异常固定写法

    public IllegalNameException(){

    }
    public IllegalNameException(String msg){
        super(msg);
    }

}

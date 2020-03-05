package Function.Six;

import java.io.*;

public class function_six {
    public static void bassic_function() throws IllegalNameException {
        FileInputStream fil1 = null;
        //IO流的开启与关闭，对象的建立有范围需要考虑，不然无法关闭IO流
        try{
        fil1 = new FileInputStream("e:/javaTestFiles/test1.txt");
        System.out.println(fil1);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            if(fil1!=null){
                try {
                    fil1.close();
                    System.out.println("IO流已关闭");
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Now in to second exception");

        ExceptionTwo cR = new ExceptionTwo();
        cR.CustomService();
    }
}

package Function.Six;

import java.io.*;

public class function_six {
    public static void bassic_function(){
        try{
        FileInputStream fil1 = new FileInputStream("e:/javaTestFiles/test1.txt");
        System.out.println(fil1);
        fil1.read();
        }catch (FileNotFoundException e){
            System.out.println("No files");
        }catch (IOException e){
            System.out.println("Read wrong");
        }
    }
}

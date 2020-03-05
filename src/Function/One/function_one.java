package Function.One;

import java.util.*;

public class function_one {
    public static void bassic_function(){
        System.out.print("Input the first number:");
        Scanner function_one_input1 = new Scanner(System.in);
        String str1 = function_one_input1.nextLine();
        int function_one_input1_done = Integer.parseInt(str1);
        System.out.print("Input the next number:");
        Scanner function_one_input2 = new Scanner(System.in);
        String str2 = function_one_input2.nextLine();
        int function_one_input2_done = Integer.parseInt(str2);
        System.out.println( function_one_input1_done + "+" + function_one_input2_done + "=" + (function_one_input1_done+function_one_input2_done));
    }
}

package Function;

import Function.Five.function_five;
import Function.Four.function_four;
import Function.One.function_one;
import Function.Six.function_six;
import Function.Three.function_three;
import Function.Two.function_two;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class first {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException {
        function_add_index.welcomeIndex();
        System.out.print("Please input the function number:");
        Scanner s = new Scanner(System.in);
        String str1 =s.nextLine();
        if(str1.contains("1") || str1.contains("2") || str1.contains("3") || str1.contains("4") || str1.contains("5") || str1.contains("6")) {
            int select_number1 = Integer.parseInt(str1);
            switch (select_number1) {
                case 1:
                    System.out.println("You have choose Function one");
                    function_one.bassic_function();
                    break;
                case 2:
                    System.out.println("You have choose Function two");
                    function_two.bassic_function();
                    break;
                case 3:
                    System.out.println("You have choose Function three");
                    function_three.bassic_function();
                    break;
                case 4:
                    System.out.println("You have choose Function four");
                    function_four.bassic_function();
                    break;
                case 5:
                    System.out.println("You have choose Function five");
                    function_five.bassic_function();
                    break;
                case 6:
                    System.out.println("You have choose Function six");
                    function_six.bassic_function();
                    break;
                default:
                    System.out.println("Unkown wrong");
                    break;
            }
            /*if (select_number1 == 1) {
                System.out.print("please input number:");
            } else if (select_number1 == 2) {
                System.out.println("please input word:");
            } else {
                System.out.println("Wrong input!");
            }*/
        }else {
            System.out.println("Wrong input!!!");
        }
    }
}
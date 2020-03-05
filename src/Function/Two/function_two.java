package Function.Two;

import Function.singleNew;
import Function.user_data;

import java.time.LocalDate;
import java.util.*;

public class function_two {
    private static user_data custom = singleNew.getsingleNew();
    private static LocalDate createTime = LocalDate.now();

    private static void function_two_index(){
        System.out.println("Bassically,it's a simple message collecting system,hope I can use Mysql in future");
        System.out.println("Input the message:");
    }

    private static boolean function_two_checkDetails_year(int x){
        if(x>=2018 && x<=2020){
            return true;
        }else {
            return false;
        }
    }

    private static boolean function_two_checkDetails_month(int x){
        if(x>=1 && x<=12){
            return true;
        }else {
            return false;
        }
    }

    private static boolean function_two_checkDetails_day(int x) {
        if (x >= 1 && x <= 31) {
            return true;
        } else {
            return false;
        }
    }

    private static void function_two_creatDetails_year(){
        System.out.print("year:");
        Scanner det1 = new Scanner(System.in);
        String str1 = det1.nextLine();
        int year = Integer.parseInt(str1);
        if(function_two_checkDetails_year(year)){
            custom.setYear(year);
        }else {
            System.out.println("Wrong year input,please input again");
            function_two_creatDetails_year();
        }
    }

    private static void function_two_creatDetails_month() {
        System.out.print("month:");
        Scanner det2 = new Scanner(System.in);
        String str2 = det2.nextLine();
        int month = Integer.parseInt(str2);
        if(function_two_checkDetails_month(month)){
            custom.setMonth(month);
        }else {
            System.out.println("Wrong month input,please input again");
            function_two_creatDetails_month();
        }
    }

    private static void function_two_creatDetails_day() {
        System.out.print("day:");
        Scanner det3 = new Scanner(System.in);
        String str3 = det3.nextLine();
        int day = Integer.parseInt(str3);
        if(function_two_checkDetails_day(day)){
            custom.setDay(day);
        }else {
            System.out.println("Wrong day input,please input again");
            function_two_creatDetails_day();
        }
    }

    private static void function_two_creatDetails_name(){
        System.out.print("name:");
        Scanner det4 = new Scanner(System.in);
        String str4 = det4.nextLine();
        custom.setName(str4);
    }

    /*private static void function_two_creatDetails(){                                                                  //需要一个重新输入机制，有一个把每个输入都单独写的想法，但是对类的引导还不够熟悉
        System.out.print("year:");
        Scanner det1 = new Scanner(System.in);
        String str1 = det1.nextLine();
        int year = Integer.parseInt(str1);
        if(function_two_checkDetails_year(year)){
            custom.year=year;
        }else {
            System.out.println("Wrong year input");
        }

        System.out.print("month:");
        Scanner det2 = new Scanner(System.in);
        String str2 = det2.nextLine();
        int month = Integer.parseInt(str2);
        if(function_two_checkDetails_mouth(month)){
            custom.month=month;
        }else {
            System.out.println("Wrong month input");
        }

        System.out.print("day:");
        Scanner det3 = new Scanner(System.in);
        String str3 = det3.nextLine();
        int day = Integer.parseInt(str3);
        if(function_two_checkDetails_day(day)){
            custom.day=day;
        }else {
            System.out.println("Wrong day input");
        }

        System.out.print("name:");
        Scanner det4 = new Scanner(System.in);
        String str4 = det4.nextLine();
        custom.name=str4;
    }
    */

    private static void function_two_print(){
        System.out.println();
        System.out.println("Create time is " + createTime);
        System.out.println(custom.getYear() + "/" + custom.getMonth() + "/" + custom.getDay() + "/" + " the name is " + custom.getName());
    }

    public static void bassic_function(){
        function_two_index();
        function_two_creatDetails_year();
        function_two_creatDetails_month();
        function_two_creatDetails_day();
        function_two_creatDetails_name();
        function_two_print();
    }
}

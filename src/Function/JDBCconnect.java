package Function;

import javax.print.DocFlavor;
import java.sql.*;
import java.util.*;
import java.time.*;

public class JDBCconnect {
    private static String id;
    private static int id_2;
    private static String JDBCname;
    private static String JDBCphoneNumber;
    private static int JDBCage;
    private static String createDay;

    private static user_data customerInsql = new user_data();

    private static boolean function_three_ageCheck(int age){
        if(age>0){
            return true;
        }else {
            return false;
        }
    }

    private static void function_three_nameInput(){
        System.out.print("name:");
        Scanner det1 = new Scanner(System.in);
        String str1 = det1.nextLine();
        customerInsql.setName(str1);
    }

    private static void function_three_phoneIput(){
        System.out.print("phone number:");
        Scanner det2 = new Scanner(System.in);
        String str2 = det2.nextLine();
        customerInsql.setPhoneNumber(str2);
    }

    private static void function_three_ageIput(){
        System.out.print("age:");
        Scanner det3 = new Scanner(System.in);
        String str3 = det3.nextLine();
        int age = Integer.parseInt(str3);
        if(function_three_ageCheck(age)) {
            customerInsql.setAge(age);
        }else {
            function_three_ageIput();
        }
    }

    private static void function_three_input(){
        function_three_nameInput();
        function_three_phoneIput();
        function_three_ageIput();
    }

    private static void JDBC_Index(){
        System.out.println("  --please choose the function you want:");
        System.out.println("  --add(1) ");
        System.out.println("  --delect(2)");
        System.out.println("  --modify(3)");
        System.out.println("  --find(4)");
    }

    private static void JDBC_chooseFunction_one() throws ClassNotFoundException, SQLException{
        function_three_input();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata?serverTimezone=UTC", "root", "yoyo1009yyz");
        String sql = "insert into customer values(" + id_2 + "','" + JDBCname + "','" + JDBCphoneNumber +"','" + JDBCage + "','" + createDay +");";
        PreparedStatement statement = connection.prepareCall(sql);
        connection.close();
        startFind();
    }

    private static void JDBC_chooseFunction_two() throws ClassNotFoundException, SQLException{

    }

    private static void JDBC_chooseFunction_three() throws ClassNotFoundException, SQLException{

    }

    private static void JDBC_chooseFunction() throws SQLException, ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        String str1 =s.nextLine();
        if(str1.contains("1") || str1.contains("2") || str1.contains("3") || str1.contains("4")) {
            int select_number1 = Integer.parseInt(str1);
            switch (select_number1) {
                case 1:
                    System.out.println("You have choose add");
                    JDBC_chooseFunction_one();
                    break;
                case 2:
                    System.out.println("You have choose delect");
                    JDBC_chooseFunction_two();
                    break;
                case 3:
                    System.out.println("You have choose modify");
                    JDBC_chooseFunction_three();
                    break;
                case 4:
                    System.out.println("You have choose find");
                    startFind();
                    break;
                default:
                    System.out.println("Unkown wrong");
                    break;
            }
        }else {
            System.out.println("Wrong input!!!");
        }
    }

    private static void startFind() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata?serverTimezone=UTC", "root", "yoyo1009yyz");
        String sql = "select * from customer";
        PreparedStatement statement = connection.prepareCall(sql);
        ResultSet resultSet = statement.executeQuery();
        System.out.println("Here is the records we have:");
        while (resultSet.next()) {                                                                                      //如果有下一条记录
            id = resultSet.getString("id");
            String name = resultSet.getString("Name");                                                                  //根据列名返回值
            String phoneNumber = resultSet.getString("PhoneNumber");                                                    //根据列名返回值
            int age = resultSet.getInt("Age");                                                                          //根据列的顺序返回值
            String theDay = resultSet.getString("createDay");                                                           //根据列的顺序返回值
            System.out.println(id + "\t" + name + "\t" + phoneNumber + "\t" + age + "\t" + theDay);
        }
        statement.close();
        connection.close();
    }


    public static void getInJDBC() throws SQLException, ClassNotFoundException {
        JDBCname=customerInsql.getName();
        JDBCphoneNumber=customerInsql.getPhoneNumber();
        JDBCage=customerInsql.getAge();
        JDBC_Index();
        JDBC_chooseFunction();
    }
}

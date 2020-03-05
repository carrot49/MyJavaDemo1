package Function.Three;

import Function.JDBCconnect;

import java.sql.*;
import java.util.Scanner;

public class function_three {

    private static void function_three_index(){
        System.out.println();
        System.out.println("I will realize some mysql bassic function in this function");
        System.out.println();
    }

    public static void bassic_function() throws SQLException, ClassNotFoundException {
        function_three_index();
        JDBCconnect.getInJDBC();
    }
}

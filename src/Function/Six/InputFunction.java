package Function.Six;

import java.util.Scanner;

public class InputFunction {
    public static int InputMission1(){
        Scanner functionSevenInput = new Scanner(System.in);
        String arrNumberBefore = functionSevenInput.nextLine();
        int arrNumberAfter = Integer.parseInt(arrNumberBefore);
        return arrNumberAfter;
    }
}

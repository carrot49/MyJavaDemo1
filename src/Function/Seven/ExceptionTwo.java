package Function.Seven;

import java.util.Scanner;

public class ExceptionTwo{

    public void CustomService() throws IllegalNameException {

        Scanner name = new Scanner(System.in);
        String customName = name.nextLine();

        customRegister custom1 = new customRegister();
        custom1.register(customName);

    }
}

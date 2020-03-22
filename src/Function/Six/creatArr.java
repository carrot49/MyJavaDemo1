package Function.Six;

import java.util.Scanner;

public class creatArr {

    int tempNumber;
    int[] targetArr;
    int[] endArr;

    creatArr(){

    }

    creatArr(int x){
        this.tempNumber=x;
        this.targetArr = new int[x];
    }

    public void InputTargetArr(){

        for(int i = 0; i<tempNumber; i++){
            Scanner InputTemp = new Scanner(System.in);
            String InputOne = InputTemp.nextLine();
            int arrNumber = Integer.parseInt(InputOne);
            targetArr[i]=arrNumber;
            System.out.println("The " + (i+1) + " is done");
        }

        System.out.println("All done, here it is");
        for(int k = 0; k<tempNumber; k++){
            System.out.print(targetArr[k]);
        }
        System.out.println();

        System.out.println("Do you want sort?(y/n)");
        Scanner chooseSelect1 = new Scanner(System.in);
        String select1 = chooseSelect1.nextLine();
        switch (select1.toLowerCase()){
            case "y":
                resetArr Arr2 = new resetArr();
                endArr=Arr2.resetFunction(targetArr,tempNumber);
                System.out.println("All done, here it is");
                for(int k=0; k<tempNumber; k++){
                    System.out.print(endArr[k]);
                }
                System.out.println();
                break;
            case "n":
                System.out.println("Exit");
                break;
            default:
                System.out.println("Wrong input");
                break;
        }

    }

}

package Function;

public class function_add_index {
    private final static int function_number=6;

    public static void welcomeIndex(){
        welcome_word_image();
        welcome_select_image();                                                                                         //总有一天我要把这个欢迎界面改掉...好吧我改了，也许还能再好看点
        /*
        System.out.println("--------------------------------------------------------");
        System.out.println("------------Welcome to my first java project------------");
        System.out.println("------------------Select what you want------------------");
        System.out.println("--------------------------------------------------------");
        */

        /*
        System.out.println("   --Function 1");
        System.out.println("   --Function 2");
        System.out.println("   --Function 3");
        System.out.println("   --Function 4");
        */
    }

    private static void welcome_select_image(){
        for(int i=1;i<=function_number;i++){
            switch (i){
                case 1:
                    System.out.print("   --Function " + i);
                    System.out.println("   a simple add function");
                    break;
                case 2:
                    System.out.print("   --Function " + i);
                    System.out.println("   a simple form which hope can use mysql");
                    break;
                case 3:
                    System.out.print("   --Function " + i);
                    System.out.println("   JDBC and mysql ,do it");
                    break;
                case 4:
                    System.out.print("   --Function " + i);
                    System.out.println("   super");
                    break;
                case 5:
                    System.out.print("   --Function " + i);
                    System.out.println("   Something about String");
                    break;
                case 6:
                    System.out.print("   --Function " + i);
                    System.out.println("   Exception");
                    break;
                default:
                    System.out.println("Unkown wrong");
                    break;
            }

        }
    }

    private static void welcome_word_image(){
        int i=1,j=1,m=50;
        int temp;
        while (i<5){
            if(j==3){
                String str1="Welcome to my first java project";
                int str1_length=str1.length();
                str1_length=str1_length/2;
                for(temp=m-str1_length;temp>=1;temp--){
                    System.out.print("-");
                }
                System.out.print(str1);
                for(temp=m-str1_length;temp>=1;temp--){
                    System.out.print("-");
                }
                System.out.println("");
                j++;
                continue;
            }else if(j==4){
                String str3="@author carrot29";
                int str3_length=str3.length();
                str3_length=str3_length/2;
                for(temp=m-str3_length;temp>=1;temp--){
                    System.out.print("-");
                }
                System.out.print(str3);
                for(temp=m-str3_length;temp>=1;temp--){
                    System.out.print("-");
                }
                System.out.println("");
                j++;
                continue;
            }else if(j==5){
                String str2="Select what you want";
                int str2_length=str2.length();
                str2_length=str2_length/2;
                for (temp=m-str2_length;temp>=1;temp--){
                    System.out.print("-");
                }
                System.out.print(str2);
                for (temp=m-str2_length;temp>=1;temp--){
                    System.out.print("-");
                }
                System.out.println("");
            }
            for (int k = 1; k <= (2 * m); k++) {
                System.out.print("-");
            }
            System.out.println("");
            i++;
            j++;
        }
    }
}

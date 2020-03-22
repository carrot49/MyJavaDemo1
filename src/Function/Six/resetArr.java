package Function.Six;

public class resetArr {

    public int[] resetFunction(int[] x, int arrNumber){
        int[] endArr = new int[arrNumber];
        for(int i=0;i<x.length;i++){
            endArr[i]=selectMin(x);
        }
        return endArr;
    }

    private int selectMin(int[] temp){
        int minArr = 0;
        for(int i=0;i<temp.length-1;i++){
            minArr=i;
            for(int j=i+1;j<temp.length;j++){
                if(temp[minArr]>temp[j+1]){
                    minArr=j+1;
                }
            }
            if(minArr != i){
                int tempNumber = temp[i];
                temp[i]=temp[minArr];
                temp[minArr]=tempNumber;
            }
        }
        return temp[minArr];
    }
}

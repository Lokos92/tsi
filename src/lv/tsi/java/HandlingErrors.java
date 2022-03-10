package lv.tsi.java;

public class HandlingErrors {
    //Exceptions
    //Checked and unchecked
    //RuntimeException and others

    int divide(int a, int b) throws CustomEcpetion {
        if (b == 0){
            throw new CustomEcpetion("Error divided by ZERO!!");
        }
        return a/b;
    }

    int getItemFromArray(int[] array, int index){
        if(index >= array.length){
            throw new CustomUnCheckedException();
        }

        System.out.println("Item in array is: " + array[index]);
    }
}

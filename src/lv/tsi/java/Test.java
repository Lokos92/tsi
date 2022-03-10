package lv.tsi.java;

public class Test {
    public static  void main (String... args){
        var h = new HandlingErrors();
        try {
            h.divide(10, 1);
        } catch (CustomEcpetion e) {
            System.out.println("The divisor is ZERO");
        }

        int[] array = new int[]{1, 2, 3, 4, 5};

        h.getItemFromArray(array, 0);
    }
}

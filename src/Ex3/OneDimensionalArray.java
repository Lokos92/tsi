package Ex3;
import java.util.Scanner;
import java.util.Random;

public class OneDimensionalArray {
    static double[] createRandomArray(int size){
        Random rd = new Random();
        double[] arr = new double[size];
        for (int i = 0; i < size; i++){
            arr[i] = rd.nextDouble(100);
            System.out.printf("\n%.2f ", arr[i]);
        }
        return arr;
    }

    static void averageArray(double[] array){
        double average = 0;
        int count = 0;
        for (int i = 0; i < array.length;i++){
            average += array[i];
            count++;
        }
        average = average / count;
        System.out.println("\nAverage value of the array is: " + average);
    }

    public static void main(String[] args){
        double max = 0;
        double min = 101;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array > ");
        int size = input.nextInt();
        double[] arrayDoub = createRandomArray(size);
        averageArray(arrayDoub);

        for (int i = 0; i < size;i++){
            if (arrayDoub[i] > max){
                max = arrayDoub[i];
            }
            if (arrayDoub[i] < min){
                min = arrayDoub[i];
            }
        }

        System.out.println("The minimal value in the array is " + min);
        System.out.println("The maximum value in the array is " + max);
    }
}

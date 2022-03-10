package Ex5;
import java.util.Scanner;
import java.util.Random;

public class TwoDimensionalArray {
    static int[][] createRandomArray(int size){
        Random rd = new Random();
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                arr[i][j] = rd.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    static void averageColumn(int[][] array){
        float average = 0;
        int count = 0;
        for (int i = 0; i < array.length;i++) {
            for (int j = 0; j < array.length; j++) {
                average += array[j][i];
                count++;
            }
            average = average / count;
            System.out.println("Average value of the column " + i + " is: " + average);
            average = 0;
            count = 0;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array > ");
        int size = input.nextInt();
        int[][] arrayInt = createRandomArray(size);
        averageColumn(arrayInt);
    }
}

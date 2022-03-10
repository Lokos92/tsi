package Ex4;
import java.util.Arrays;

public class Marathon {
    static void printResults(String[] names, int[] time){
        int count = 0;
        for (int i = 0; i < 16; i++){
            System.out.println("Name: " + names[count] + ", Time: " + time[count]);
            count++;
        }
    }
    public static void main(String[] args){
        String[] names = new String[]{"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
        int [] times = new int[]{341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265};

        printResults(names, times);
    }
}

package Ex2;
import java.util.Scanner;

public class FactorialCalculator {
    static long factorialFor(int user){
        long fact = 1;
        for (int i = 1; i <= user; i++){
            fact = fact * i;
        }
        return fact;
    }

    static long factorialRecursion(int user){
        if (user == 0){
            return 1;
        }
        return user * factorialRecursion(user - 1);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number you want to factorize > ");
        int userinp = input.nextInt();
        long fact1 = factorialFor(userinp);
        System.out.println("Factorial of " + userinp + " using for loop is: " + fact1);

        long fact2 = factorialRecursion(userinp);
        System.out.println("Factorial of " + userinp + " using recursion is: " + fact2);
    }
}

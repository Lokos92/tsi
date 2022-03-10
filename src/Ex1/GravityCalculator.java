package Ex1;

import java.util.Scanner;

public class GravityCalculator {
    public static final double GRAVITY_CONSTANT = 9.8;
    public static final double ANOTHER_CONSTANT = 0.5;
    int fallingTime = 0;
    double initialPosition = 0;
    double initialVelocity = 0;

    public GravityCalculator(int fallingTime, double initialPosition, double initialVelocity) {
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }

    public void calculate() {
        double result = (fallingTime * fallingTime) * GRAVITY_CONSTANT * ANOTHER_CONSTANT + (initialVelocity * fallingTime) + initialPosition;
        System.out.println("Position in " + fallingTime + " seconds: " + result);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter falling time > ");
        int fallTime = input.nextInt();
        System.out.print("Enter initial position > ");
        double iniPosition = input.nextDouble();
        System.out.print("Enter initial velocity > ");
        double iniVelocity = input.nextDouble();

        var calculator = new GravityCalculator(fallTime,iniPosition,iniVelocity);
        calculator.calculate();
    }
}

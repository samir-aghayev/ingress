package lambda.easy;

/*
 * Task 11: Custom Functional Interface for Calculator Instructions:
 * Create a functional interface Calculator with a method calculate(int a, int b).
 * Implement it using lambdas to perform different operations (addition, subtraction, etc.).
 */

interface Calculator {
    double calculate(int a, int b);
}

public class CustomFunctionalInterfaceForCalculator {
    public static void main(String[] args) {
        Calculator sum = (a, b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator multiplication = (a, b) -> a * b;
        Calculator division = (a, b) -> {
            if (b != 0) {
                return (double) a / b;
            }
            throw new ArithmeticException("Division by zero");
        };
        System.out.println("Sum " + sum.calculate(6, 2));
        System.out.println("Subtraction " + subtraction.calculate(6, 2));
        System.out.println("Multiplication " + multiplication.calculate(6, 2));
        System.out.println("Division " + division.calculate(6, 2));

    }
}

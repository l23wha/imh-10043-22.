import java.util.*;

public class oops3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double multiplication = num1 * num2;
        double subtraction = num1 - num2;
        double division = (num2 != 0) ? (num1 / num2) : Double.NaN;
        System.out.println("a. Sum(Addition): " + sum);
        System.out.println("b. Multiplication: " + multiplication);
        System.out.println("c. Subtraction: " + subtraction);
        if (!Double.isNaN(division)) {
            System.out.println("d.Diviaion: " + division);
        } else {
            System.out.println("d.Division by zero is undefined.");
        }
        scanner.close();
    }
}
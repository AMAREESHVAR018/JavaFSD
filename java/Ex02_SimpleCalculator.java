import java.util.Scanner;
class Ex02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;

        System.out.print("Enter second number: ");
        double second = scanner.hasNextDouble() ? scanner.nextDouble() : 1.0;

        System.out.println("Addition: " + (first + second));
        System.out.println("Subtraction: " + (first - second));
        System.out.println("Multiplication: " + (first * second));
        System.out.println("Division: " + (second != 0 ? (first / second) : "undefined (division by zero)"));
        scanner.close();
    }
}


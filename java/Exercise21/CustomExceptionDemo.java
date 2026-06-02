import java.util.Scanner;

public class CustomExceptionDemo {
    static void validateAge(int age) throws InvalidRegistrationException {
        if (age < 18) {
            throw new InvalidRegistrationException("Registration age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Registration allowed");
        } catch (InvalidRegistrationException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
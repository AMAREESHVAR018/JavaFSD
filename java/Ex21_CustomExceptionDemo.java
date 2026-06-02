import java.util.Scanner;
class Ex21_CustomExceptionDemo {
    static void validateAge(int age) throws Ex21_InvalidRegistrationException {
        if (age < 18) {
            throw new Ex21_InvalidRegistrationException("Registration age must be 18 or above");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("Registration allowed");
        } catch (Ex21_InvalidRegistrationException exception) {
            System.out.println(exception.getMessage());
        }
    }
}



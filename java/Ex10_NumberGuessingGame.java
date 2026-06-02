import java.util.Scanner;
class Ex10_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = 15;

        System.out.print("Enter guess: ");
        int guess = scanner.nextInt();

        if (guess < target) {
            System.out.println("Too low");
        } else if (guess > target) {
            System.out.println("Too high");
        } else {
            System.out.println("Correct");
        }
    }
}


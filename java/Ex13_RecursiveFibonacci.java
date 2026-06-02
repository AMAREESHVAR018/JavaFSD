import java.util.Scanner;
class Ex13_RecursiveFibonacci {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter terms: ");
        int terms = scanner.nextInt();

        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}


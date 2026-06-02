import java.util.Scanner;
class Ex15_StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println(reversed);
    }
}


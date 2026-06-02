public class MethodOverloadingDemo {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two numbers: " + add(5, 10));
        System.out.println("Sum of three numbers: " + add(5, 10, 15));
    }
}
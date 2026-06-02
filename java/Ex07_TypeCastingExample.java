class Ex07_TypeCastingExample {
    public static void main(String[] args) {
        int value = 50;
        double widened = value;
        double decimal = 50.75;
        int narrowed = (int) decimal;

        System.out.println("Implicit cast: " + widened);
        System.out.println("Explicit cast: " + narrowed);
    }
}


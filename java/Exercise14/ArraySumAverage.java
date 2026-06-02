public class ArraySumAverage {
    public static void main(String[] args) {
        int[] marks = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double average = (double) sum / marks.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
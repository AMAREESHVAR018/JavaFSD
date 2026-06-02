public class VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        Thread first = Thread.startVirtualThread(() -> System.out.println("Virtual thread running: task 1"));
        Thread second = Thread.startVirtualThread(() -> System.out.println("Virtual thread running: task 2"));
        Thread third = Thread.startVirtualThread(() -> System.out.println("Virtual thread running: task 3"));

        first.join();
        second.join();
        third.join();
    }
}
class Ex40_VirtualThreadsExample {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(() -> System.out.println("Thread running: task 1"));
        Thread second = new Thread(() -> System.out.println("Thread running: task 2"));
        Thread third = new Thread(() -> System.out.println("Thread running: task 3"));

        first.start();
        second.start();
        third.start();

        first.join();
        second.join();
        third.join();
    }
}


public class ThreadCreationExample extends Thread {
    @Override
    public void run() {
        System.out.println("Event reminder thread running");
    }

    public static void main(String[] args) {
        ThreadCreationExample thread = new ThreadCreationExample();
        thread.start();
    }
}
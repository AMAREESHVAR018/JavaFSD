public class EventRegistration implements Registerable {
    @Override
    public void register() {
        System.out.println("Registered for Workshop");
    }

    public static void main(String[] args) {
        EventRegistration registration = new EventRegistration();
        registration.register();
    }
}
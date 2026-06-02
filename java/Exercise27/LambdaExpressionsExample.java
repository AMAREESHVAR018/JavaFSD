interface EventAction {
    void perform(String eventName);
}

public class LambdaExpressionsExample {
    public static void main(String[] args) {
        EventAction action = eventName -> System.out.println("Registering for " + eventName);
        action.perform("Music Festival");
    }
}
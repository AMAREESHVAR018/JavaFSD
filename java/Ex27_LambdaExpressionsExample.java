interface Ex27_EventAction {
    void perform(String eventName);
}
class LambdaExpressionsExample {
    public static void main(String[] args) {
        Ex27_EventAction action = eventName -> System.out.println("Registering for " + eventName);
        action.perform("Music Festival");
    }
}


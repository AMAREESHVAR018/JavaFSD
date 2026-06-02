import java.util.ArrayList;
class Ex24_ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> events = new ArrayList<>();
        events.add("Music Festival");
        events.add("Food Carnival");
        events.add("Sports Meet");

        for (String event : events) {
            System.out.println(event);
        }
    }
}


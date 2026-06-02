import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExample {
    public static void main(String[] args) {
        List<String> events = List.of("Music Festival", "Food Carnival", "Community Choir", "Sports Meet");

        List<String> musicEvents = events.stream()
                .filter(event -> event.contains("Music") || event.contains("Choir"))
                .collect(Collectors.toList());

        System.out.println("Music events: " + musicEvents);
    }
}
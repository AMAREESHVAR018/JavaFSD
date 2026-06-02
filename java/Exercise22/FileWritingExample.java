import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWritingExample {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("events.txt"))) {
            writer.println("Community Event Portal");
            writer.println("Music Festival");
            writer.println("Food Carnival");
            System.out.println("Event details written to events.txt");
        } catch (IOException exception) {
            System.out.println("File write error: " + exception.getMessage());
        }
    }
}
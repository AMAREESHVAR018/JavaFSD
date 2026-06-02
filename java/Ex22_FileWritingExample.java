import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
class Ex22_FileWritingExample {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("events.txt"))) {
            writer.println("Community Ex32_Event Portal");
            writer.println("Music Festival");
            writer.println("Food Carnival");
            System.out.println("Ex32_Event details written to events.txt");
        } catch (IOException exception) {
            System.out.println("File write error: " + exception.getMessage());
        }
    }
}



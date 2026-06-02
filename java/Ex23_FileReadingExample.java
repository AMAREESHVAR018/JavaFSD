import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class Ex23_FileReadingExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("events.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException exception) {
            System.out.println("File read error: " + exception.getMessage());
        }
    }
}


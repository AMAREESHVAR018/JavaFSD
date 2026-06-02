import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5000);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {
            System.out.println("Connected to server");
            System.out.print("Enter message: ");
            String message = scanner.nextLine();
            writer.println(message);
            System.out.println(reader.readLine());
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
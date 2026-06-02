import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started on port 5000");
            try (Socket socket = serverSocket.accept();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
                System.out.println("Client connected");
                String message = reader.readLine();
                System.out.println("Received: " + message);
                writer.println("Server: Hello Client");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
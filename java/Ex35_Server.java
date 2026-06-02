import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
class Ex35_Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Ex35_Server started on port 5000");
            try (Socket socket = serverSocket.accept();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
                System.out.println("Ex35_Client connected");
                String message = reader.readLine();
                System.out.println("Received: " + message);
                writer.println("Ex35_Server: Hello Ex35_Client");
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}



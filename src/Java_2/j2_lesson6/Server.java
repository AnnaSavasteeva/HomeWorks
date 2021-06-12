package Java_2.j2_lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static final int SERVER_PORT = 8190;
    private static final String SERVER_NAME = "Server";


    public static void main(String[] args) throws IOException {
        Socket clientSocket = null;
        Thread inputThread = null;

        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            System.out.println("Server has started");

            clientSocket = serverSocket.accept();
            System.out.println("Client has connected");

            DataInputStream fromClient = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream toClient = new DataOutputStream(clientSocket.getOutputStream());

            inputThread = Interactions.processInput(fromClient);
            Interactions.processOutput(SERVER_NAME, toClient);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputThread != null) inputThread.interrupt();
            if (clientSocket != null) clientSocket.close();
        }
    }

}

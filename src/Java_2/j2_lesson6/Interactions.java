package Java_2.j2_lesson6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Interactions {

    public static Thread processInput(DataInputStream input) {
        Thread thread = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    String message = input.readUTF();
                    System.out.println(message);
                    System.out.println("------");

                    if (message.equals("exit")) {
                        System.exit(0);
                    }
                } catch (IOException e) {
                    System.out.println("Connection was closed");
                    break;
                }
            }
        });
        thread.start();
        return thread;
    }


    public static void processOutput(String sender, DataOutputStream output) throws IOException {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Print your message: ");
                String message = scanner.nextLine();

                if (message.equals("exit")) {
                    output.writeUTF(message);
                    break;
                }

                message = String.join(": ", sender, message);
                output.writeUTF(message);

            }
    }

}

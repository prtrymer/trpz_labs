package IRC;

import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintWriter;

public class IRCConnection {
    private String server;
    private int port;
    private Socket socket;
    private PrintWriter writer;

    public void setServer(String server, int port) {
        this.server = server;
        this.port = port;
    }

    public void connect() {
        try {
            socket = new Socket(server, port);
            OutputStream outputStream = socket.getOutputStream();
            writer = new PrintWriter(outputStream, true);
            System.out.println("Connected to IRC server.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void joinChannel(String channel) {
        if (writer != null) {
            writer.println("JOIN " + channel);
            System.out.println("Joined channel: " + channel);
        } else {
            System.out.println("Not connected to any server.");
        }
    }

    public void sendMessage(String message) {
        if (writer != null) {
            writer.println("PRIVMSG " + message);
            System.out.println("Sent message: " + message);
        } else {
            System.out.println("Not connected to any server.");
        }
    }

    public void sendMetadata(String metadata) {
        if (writer != null) {
            writer.println("METADATA " + metadata);
            System.out.println("Sent metadata: " + metadata);
        } else {
            System.out.println("Not connected to any server.");
        }
    }
}
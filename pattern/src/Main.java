public class Main {
    public static void main(String[] args) {
        // Get the singleton instance of IRCClient
        IRCClient client = IRCClient.getInstance();

        // Get the IRCConnection from the client
        IRCConnection connection = client.getConnection();

        // Use the connection to connect
        connection.connect();

        // Print a message to show that the connection is established
        System.out.println("Connected to IRC server.");
    }
}
public class Main {
    public static void main(String[] args) {
        IRCCommandHandler joinHandler = new JoinCommandHandler();
        joinHandler.handleCommand("JOIN #exampleChannel");

        IRCCommandHandler messageHandler = new MessageCommandHandler();
        messageHandler.handleCommand("MESSAGE Hello, everyone!");
    }
}
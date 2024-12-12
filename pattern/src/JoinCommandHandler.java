public class JoinCommandHandler extends IRCCommandHandler {
    private String channel;

    @Override
    protected void parseCommand(String command) {
        channel = command.split(" ")[1];
    }

    @Override
    protected void executeCommand() {
        System.out.println("Joining channel: " + channel);
    }
}
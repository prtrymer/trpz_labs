public class MessageCommandHandler extends IRCCommandHandler {
    private String message;

    @Override
    protected void parseCommand(String command) {
        message = command.substring(command.indexOf(" ") + 1);
    }

    @Override
    protected void executeCommand() {
        System.out.println("Sending message: " + message);
    }
}
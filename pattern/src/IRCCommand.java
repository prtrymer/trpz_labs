public class IRCCommand implements IRCComponent {
    private String command;

    public IRCCommand(String command) {
        this.command = command;
    }

    @Override
    public void execute() {
        System.out.println("Executing command: " + command);
    }
}

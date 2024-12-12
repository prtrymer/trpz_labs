public abstract class IRCCommandHandler {
    public final void handleCommand(String command) {
        parseCommand(command);
        executeCommand();
        logCommand();
    }

    protected abstract void parseCommand(String command);
    protected abstract void executeCommand();
    protected void logCommand() {
        System.out.println("Command handled");
    }
}

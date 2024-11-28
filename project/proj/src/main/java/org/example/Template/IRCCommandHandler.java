package org.example.Template;

public abstract class IRCCommandHandler {
    public final void handleCommand(String command) {
        parseCommand(command);
        executeCommand();
        logCommand();
    }

    protected abstract void parseCommand(String command);
    protected abstract void executeCommand();
    protected void logCommand() {
        // Логіка логування команди
    }
}

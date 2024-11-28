package org.example.Template;

public class JoinCommandHandler extends IRCCommandHandler {
    private String channel;

    @Override
    protected void parseCommand(String command) {
        // Логіка розбору команди JOIN
        channel = command.split(" ")[1];
    }

    @Override
    protected void executeCommand() {
        // Логіка обробки команди JOIN
    }
}

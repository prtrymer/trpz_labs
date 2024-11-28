package org.example.Composite;

public class IRCCommand implements IRCComponent {
    private String command;

    public IRCCommand(String command) {
        this.command = command;
    }

    @Override
    public void execute() {
        // Логіка обробки команди IRC
    }
}

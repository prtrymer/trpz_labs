package AbstractFactory;

import IRC.IRCConnection;
import Singleton.IRCClient;

public class JoinCommand implements Command {
    private String channel;
    private String message;

    public JoinCommand(String channel, String message) {
        this.channel = channel;
        this.message = message;
    }

    @Override
    public void execute() {
        IRCClient client = IRCClient.getInstance();
        IRCConnection connection = client.getConnection();
        connection.joinChannel(channel);
        connection.sendMessage(message);
    }
}
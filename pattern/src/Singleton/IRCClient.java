package Singleton;

import IRC.IRCConnection;

public class IRCClient {
    private static IRCClient instance;
    private final IRCConnection connection;

    private IRCClient() {
        connection = new IRCConnection();
    }

    public static synchronized IRCClient getInstance() {
        if (instance == null) {
            instance = new IRCClient();
        }
        return instance;
    }

    public IRCConnection getConnection() {
        return connection;
    }
}
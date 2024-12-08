import AbstractFactory.Command;
import AbstractFactory.CommandFactory;
import AbstractFactory.IRCCommandFactory;
import Singleton.IRCClient;
import IRC.IRCConnection;

public class Main {
    public static void main(String[] args) {
        IRCClient client = IRCClient.getInstance();

        IRCConnection connection = client.getConnection();

        connection.setServer("irc.freenode.net", 6667);

        connection.connect();

        CommandFactory commandFactory = new IRCCommandFactory();

        Command joinCommand = commandFactory.createCommand("join", "#exampleChannel", "Hello, everyone!");
        joinCommand.execute();

        Command metadataCommand = commandFactory.createCommand("metadata", "exampleMetadata");
        metadataCommand.execute();
    }
}
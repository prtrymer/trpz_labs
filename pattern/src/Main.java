public class Main {
    public static void main(String[] args) {
        IRCConnectionBuilder builder = new IRCConnectionBuilder();
        IRCConnection connection = builder.setServer("irc.freenode.net")
                                         .setPort(6667)
                                         .build();
        connection.joinChannel("#example");
        connection.sendMessage("Hello, world!");
        connection.sendMetadata("example");
    }
}

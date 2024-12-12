public class Main {
    public static void main(String[] args) {
        IRCCommand command1 = new IRCCommand("JOIN #channel");
        IRCCommand command2 = new IRCCommand("PRIVMSG #channel :Hello everyone!");
        IRCCommand command3 = new IRCCommand("PART #channel");

        IRCCommandGroup group = new IRCCommandGroup();
        group.addComponent(command1);
        group.addComponent(command2);
        group.addComponent(command3);

        group.execute();
    }
}

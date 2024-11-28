package org.example;

import org.example.AbstractFactory.Command;
import org.example.AbstractFactory.CommandFactory;
import org.example.AbstractFactory.IRCCommandFactory;
import org.example.Builder.IRCConnectionBuilder;
import org.example.Singleton.IRCClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Mono;

import java.util.Scanner;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private UserRegistration userRegistration;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter port: ");
        int port = scanner.nextInt();

        Mono<Users> userMono = userRegistration.registerUser(username, port);
        userMono.subscribe(user -> System.out.println("User registered: " + user.getUsername()));

        IRCClient client = IRCClient.getInstance();
        IRCConnection connection = client.getConnection();

        IRCConnectionBuilder builder = new IRCConnectionBuilder();
        connection = builder.setServer("localhost")
                .setPort(8080)
                .build();

        CommandFactory factory = new IRCCommandFactory();
        Command joinCommand = factory.createCommand("join", "#channel", "Hello, everyone!");
        joinCommand.execute();

        Command metadataCommand = factory.createCommand("metadata", "example metadata");
        metadataCommand.execute();
    }
}
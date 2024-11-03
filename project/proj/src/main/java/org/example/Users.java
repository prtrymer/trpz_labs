package org.example;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "users")  // Додаємо подвійні лапки
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username cannot be blank")
    @Column(name = "username", nullable = false)
    private String username;

    @Positive(message = "Port must be a positive number")
    @Column(name = "port", nullable = false)
    private int port;

    // Constructors
    public User() {
    }

    public User(String username, int port) {
        this.username = username;
        this.port = port;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    // Additional Methods
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", port=" + port +
                '}';
    }
}
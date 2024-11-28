package org.example.Composite;

import java.util.ArrayList;
import java.util.List;

public class IRCCommandGroup implements IRCComponent {
    private List<IRCComponent> components = new ArrayList<>();

    public void addComponent(IRCComponent component) {
        components.add(component);
    }

    @Override
    public void execute() {
        for (IRCComponent component : components) {
            component.execute();
        }
    }
}
package com.afs.tdd;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        this.commandList.add(command);
    }

    public void executeCommands() {
        commandList.stream().forEach(Command::execute);
    }
}

package com.afs.tdd.command;

import com.afs.tdd.MarsRover;
import com.afs.tdd.command.Command;

public class TurnLeftCommand implements Command {
    private MarsRover marsRover;

    public TurnLeftCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.turnLeft();
    }
}

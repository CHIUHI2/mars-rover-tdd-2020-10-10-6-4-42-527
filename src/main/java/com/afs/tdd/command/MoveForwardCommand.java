package com.afs.tdd.command;

import com.afs.tdd.MarsRover;
import com.afs.tdd.command.Command;

public class MoveForwardCommand implements Command {
    private MarsRover marsRover;

    public MoveForwardCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.moveForward();
    }
}

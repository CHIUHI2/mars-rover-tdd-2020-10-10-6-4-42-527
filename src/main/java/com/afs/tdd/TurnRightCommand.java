package com.afs.tdd;

public class TurnRightCommand implements Command{
    private MarsRover marsRover;

    public TurnRightCommand(MarsRover marsRover) {
        this.marsRover = marsRover;
    }

    @Override
    public void execute() {
        marsRover.turnRight();
    }
}

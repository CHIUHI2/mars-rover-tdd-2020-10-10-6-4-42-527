package com.afs.tdd;

import java.util.Arrays;
import java.util.Objects;

public class MarsRover {
    private int xLocation;
    private int yLocation;
    private Direction direction;
    private final CommandFactory commandFactory = new CommandFactory();

    public MarsRover(int xLocation, int yLocation, Direction direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.direction = direction;
    }

    public int getXLocation() {
        return xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }

    public Direction getDirection() {
        return direction;
    }

    public void processInstructions(String instructions) {
        Invoker invoker = new Invoker();

        Arrays.stream(instructions.split(""))
                .map(Instruction::getEnum)
                .filter(Objects::nonNull)
                .forEach(instruction -> invoker.addCommand(commandFactory.buildCommand(instruction, this)));

        invoker.executeCommands();

        System.out.printf("Y Location : %s\nX Location : %s\nHeading : %s", this.yLocation, this.xLocation, this.direction);
    }

    public void moveForward() {
        switch (this.direction) {
            case NORTH:
                this.yLocation += 1;
                break;
            case EAST:
                this.xLocation += 1;
                break;
            case SOUTH:
                this.yLocation -= 1;
                break;
            case WEST:
                this.xLocation -= 1;
                break;
        }
    }

    public void turnLeft() {
        this.direction = this.direction.getLeft();
    }

    public void turnRight() {
        this.direction = this.direction.getRight();
    }
}

package com.afs.tdd;

import java.util.Arrays;
import java.util.Objects;

public class MarsRover {
    private int xLocation;
    private int yLocation;
    private Direction direction;

    public MarsRover(int xLocation, int yLocation, Direction direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.direction = direction;
    }

    public int getXLocation() { return xLocation; }

    public int getYLocation() { return yLocation; }

    public Direction getDirection() { return direction; }

    public void processCommands(String commands) {
        Invoker invoker = new Invoker();

        Arrays.stream(commands.split(""))
                .map(Instruction::getEnum)
                .filter(Objects::nonNull)
                .forEach(command -> this.submitInstruction(invoker, command));

        invoker.executeCommands();

        System.out.printf("Y Location : %s\nX Location : %s\nHeading : %s", this.yLocation, this.xLocation, this.direction);
    }

    public void submitInstruction(Invoker invoker, Instruction instruction) {
        switch (instruction) {
            case MOVE_FORWARD :
                MoveForwardCommand moveForwardCommand = new MoveForwardCommand(this);
                invoker.addCommand(moveForwardCommand);
                break;
            case TURN_RIGHT :
                TurnRightCommand turnRightCommand = new TurnRightCommand(this);
                invoker.addCommand(turnRightCommand);
                break;
            case TURN_LEFT :
                TurnLeftCommand turnLeftCommand = new TurnLeftCommand(this);
                invoker.addCommand(turnLeftCommand);
                break;
        }
    }

    public void moveForward() {
        switch (this.direction) {
            case NORTH :
                this.yLocation += 1;
                break;
            case EAST :
                this.xLocation += 1;
                break;
            case SOUTH :
                this.yLocation -= 1;
                break;
            case WEST :
                this.xLocation -= 1;
                break;
        }
    }

    public void turnLeft() {
        switch (this.direction) {
            case NORTH :
                this.direction = Direction.WEST;
                break;
            case EAST :
                this.direction = Direction.NORTH;
                break;
            case SOUTH :
                this.direction = Direction.EAST;
                break;
            case WEST :
                this.direction = Direction.SOUTH;
                break;
        }
    }

    public void turnRight() {
        switch (this.direction) {
            case NORTH :
                this.direction = Direction.EAST;
                break;
            case EAST :
                this.direction = Direction.SOUTH;
                break;
            case SOUTH :
                this.direction = Direction.WEST;
                break;
            case WEST :
                this.direction = Direction.NORTH;
                break;
        }
    }
}

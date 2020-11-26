package com.afs.tdd;

import java.util.Arrays;

public class MarsRover {
    private int xLocation;
    private int yLocation;
    private String direction;

    public MarsRover(int xLocation, int yLocation, String direction) {
        this.xLocation = xLocation;
        this.yLocation = yLocation;
        this.direction = direction;
    }

    public int getxLocation() { return xLocation; }

    public int getyLocation() { return yLocation; }

    public String getDirection() { return direction; }

    public void processCommands(String commands) {
        Arrays.asList(commands.split(""))
                .forEach(command -> this.executeCommand(command));
    }

    public void executeCommand(String command) {
        switch (command) {
            case MarsRoverConstant.commandMoveForward :
                this.moveForward();
                break;
            case MarsRoverConstant.commandTurnRight :
                this.turnRight();
                break;
            case MarsRoverConstant.commandTurnLeft :
                this.turnLeft();
                break;
        }
    }

    public void moveForward() {
        switch (this.direction) {
            case MarsRoverConstant.directionNorth :
                this.yLocation += 1;
                break;
            case MarsRoverConstant.directionEast :
                this.xLocation += 1;
                break;
            case MarsRoverConstant.directionSouth :
                this.yLocation -= 1;
                break;
            case MarsRoverConstant.directionWest :
                this.xLocation -= 1;
                break;
        }
    }

    public void turnLeft() {
        switch (this.direction) {
            case MarsRoverConstant.directionNorth :
                this.direction = MarsRoverConstant.directionWest;
                break;
            case MarsRoverConstant.directionEast :
                this.direction = MarsRoverConstant.directionNorth;
                break;
            case MarsRoverConstant.directionSouth :
                this.direction = MarsRoverConstant.directionEast;
                break;
            case MarsRoverConstant.directionWest :
                this.direction = MarsRoverConstant.directionSouth;
                break;
        }
    }

    public void turnRight() {
        switch (this.direction) {
            case MarsRoverConstant.directionNorth :
                this.direction = MarsRoverConstant.directionEast;
                break;
            case MarsRoverConstant.directionEast :
                this.direction = MarsRoverConstant.directionSouth;
                break;
            case MarsRoverConstant.directionSouth :
                this.direction = MarsRoverConstant.directionWest;
                break;
            case MarsRoverConstant.directionWest :
                this.direction = MarsRoverConstant.directionNorth;
                break;
        }
    }
}

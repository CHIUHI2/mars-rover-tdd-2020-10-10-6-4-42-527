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

    private static final String directionNorth = "N";
    private static final String directionSouth = "S";
    private static final String directionEast = "E";
    private static final String directionWest = "W";

    private static final String commandMoveForward = "M";
    private static final String commandTurnLeft = "L";
    private static final String commandTurnRight = "R";

    public void executeCommand(String command) {
        switch (command) {
            case commandMoveForward :
                this.moveForward();
                break;
            case commandTurnRight :
                this.turnRight();
                break;
            case commandTurnLeft :
                this.turnLeft();
                break;
        }
    }

    public void moveForward() {
        switch (this.direction) {
            case directionNorth :
                this.yLocation += 1;
                break;
            case directionEast :
                this.xLocation += 1;
                break;
            case directionSouth :
                this.yLocation -= 1;
                break;
            case directionWest :
                this.xLocation -= 1;
                break;
        }
    }

    public void turnLeft() {
        switch (this.direction) {
            case directionNorth :
                this.direction = directionWest;
                break;
            case directionEast :
                this.direction = directionNorth;
                break;
            case directionSouth :
                this.direction = directionEast;
                break;
            case directionWest :
                this.direction = directionSouth;
                break;
        }
    }

    public void turnRight() {
        switch (this.direction) {
            case directionNorth :
                this.direction = directionEast;
                break;
            case directionEast :
                this.direction = directionSouth;
                break;
            case directionSouth :
                this.direction = directionWest;
                break;
            case directionWest :
                this.direction = directionNorth;
                break;
        }
    }
}

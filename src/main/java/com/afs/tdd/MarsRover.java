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
                if (directionNorth.equals(this.direction)) this.yLocation += 1;
                else if (directionSouth.equals(this.direction)) this.yLocation -= 1;
                else if (directionEast.equals(this.direction)) this.xLocation += 1;
                else if (directionWest.equals(this.direction)) this.xLocation -= 1;
                break;
            case commandTurnRight :
                if (directionNorth.equals(this.direction)) this.direction = directionEast;
                else if (directionEast.equals(this.direction)) this.direction = directionSouth;
        }
    }
}

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
    public void executeCommand(String command) {
        switch (command) {
            case "M" :
                if (directionNorth.equals(this.direction)) this.yLocation += 1;
        }
    }
}

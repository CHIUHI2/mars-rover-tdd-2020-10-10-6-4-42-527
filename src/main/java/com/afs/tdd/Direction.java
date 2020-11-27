package com.afs.tdd;

public enum Direction {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    private final String label;

    Direction(String label) {
        this.label = label;
    }

    public String getLabel() { return this.label; }
}

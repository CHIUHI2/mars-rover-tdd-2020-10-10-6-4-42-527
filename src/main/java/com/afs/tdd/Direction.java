package com.afs.tdd;

import java.util.Arrays;

public enum Direction {
    NORTH("N", "W", "E"),
    EAST("E", "N", "S"),
    SOUTH("S", "E", "W"),
    WEST("W", "S", "N");

    private final String label;
    private final String left;
    private final String right;

    Direction(String label, String left, String right) {
        this.label = label;
        this.left = left;
        this.right = right;
    }

    public Direction getLeft() { return this.getEnumWithLabel(this.left); }

    public Direction getRight() { return this.getEnumWithLabel(this.right); }

    private Direction getEnumWithLabel(String label) {
        return Arrays.stream(Direction.values())
                .filter(direction -> direction.label.equals(label))
                .findFirst()
                .orElse(null);
    }
}

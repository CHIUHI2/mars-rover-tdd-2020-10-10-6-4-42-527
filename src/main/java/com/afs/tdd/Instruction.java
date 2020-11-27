package com.afs.tdd;

public enum Instruction {
    MOVE_FORWARD("M"),
    TURN_LEFT("L"),
    TURN_RIGHT("R");

    private final String label;

    Instruction(String label) {
        this.label = label;
    }

    public String getLabel() { return this.label; }

    public static Instruction getEnum(String input) {
        for(Instruction instruction : Instruction.values()) {
            if(instruction.label.equalsIgnoreCase(input)) {
                return  instruction;
            }
        }

        return null;
    }
}

package com.afs.tdd;

import com.afs.tdd.command.Command;
import com.afs.tdd.command.MoveForwardCommand;
import com.afs.tdd.command.TurnLeftCommand;
import com.afs.tdd.command.TurnRightCommand;

public class CommandFactory {
    public Command buildCommand(Instruction instruction, MarsRover marsRover) {
        switch (instruction) {
            case MOVE_FORWARD:
                return new MoveForwardCommand(marsRover);
            case TURN_RIGHT:
                return new TurnRightCommand(marsRover);
            case TURN_LEFT:
                return new TurnLeftCommand(marsRover);
        }

        return null;
    }
}

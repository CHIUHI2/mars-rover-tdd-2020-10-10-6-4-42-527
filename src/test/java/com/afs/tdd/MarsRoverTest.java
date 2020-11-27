package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_y_add_1_when_process_command_given_0_0_N_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.NORTH);
        //when
        marsRover.processCommands(Instruction.MOVE_FORWARD.getLabel());
        //then
        assertEquals(1, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

    @Test
    void should_y_minus_1_when_process_command_given_0_0_S_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, Direction.SOUTH);
        //when
        marsRover.processCommands(Instruction.MOVE_FORWARD.getLabel());
        //then
        assertEquals(-1, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }

    @Test
    void should_x_add_1_when_process_command_given_0_0_E_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.EAST);
        //when
        marsRover.processCommands(Instruction.MOVE_FORWARD.getLabel());
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(1, marsRover.getXLocation());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    void should_x_minus_1_when_process_command_given_0_0_W_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.WEST);
        //when
        marsRover.processCommands(Instruction.MOVE_FORWARD.getLabel());
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(-1, marsRover.getXLocation());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    void should_direction_change_E_when_process_command_given_0_0_N_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.NORTH);
        //when
        marsRover.processCommands(Instruction.TURN_RIGHT.getLabel());
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    void should_direction_change_S_when_process_command_given_0_0_E_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.EAST);
        //when
        marsRover.processCommands(Instruction.TURN_RIGHT.getLabel());
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }

    @Test
    void should_direction_change_W_when_process_command_given_0_0_S_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.SOUTH);
        //when
        marsRover.processCommands(Instruction.TURN_RIGHT.getLabel());
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    void should_direction_change_N_when_process_command_given_0_0_W_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.WEST);
        //when
        marsRover.processCommands(Instruction.TURN_RIGHT.getLabel());
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

    @Test
    void should_direction_change_W_when_process_command_given_0_0_N_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.NORTH);
        //when
        marsRover.processCommands(Instruction.TURN_LEFT.getLabel());
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(Direction.WEST, marsRover.getDirection());
    }

    @Test
    void should_direction_change_N_when_process_command_given_0_0_E_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.EAST);
        //when
        marsRover.processCommands(Instruction.TURN_LEFT.getLabel());
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }

    @Test
    void should_direction_change_E_when_process_command_given_0_0_S_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.SOUTH);
        //when
        marsRover.processCommands(Instruction.TURN_LEFT.getLabel());
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(Direction.EAST, marsRover.getDirection());
    }

    @Test
    void should_direction_change_S_when_process_command_given_0_0_W_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.WEST);
        //when
        marsRover.processCommands(Instruction.TURN_LEFT.getLabel());
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(Direction.SOUTH, marsRover.getDirection());
    }

    @Test
    void should_return_2_1_N_when_process_commands_given_0_0_N_MRMLRLM() {
        //given
        MarsRover marsRover = new MarsRover(0,0,Direction.NORTH);
        //when
        String commands = Instruction.MOVE_FORWARD.getLabel()
                .concat(Instruction.TURN_RIGHT.getLabel())
                .concat(Instruction.MOVE_FORWARD.getLabel())
                .concat(Instruction.TURN_LEFT.getLabel())
                .concat(Instruction.TURN_RIGHT.getLabel())
                .concat(Instruction.TURN_LEFT.getLabel())
                .concat(Instruction.MOVE_FORWARD.getLabel());

        marsRover.processCommands(commands);
        //then
        assertEquals(2, marsRover.getYLocation());
        assertEquals(1, marsRover.getXLocation());
        assertEquals(Direction.NORTH, marsRover.getDirection());
    }
}

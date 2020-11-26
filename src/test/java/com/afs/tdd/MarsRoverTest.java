package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    private static final String directionNorth = "N";
    private static final String directionSouth = "S";
    private static final String directionEast = "E";
    private static final String directionWest = "W";

    private static final String commandMoveForward = "M";
    private static final String commandTurnLeft = "L";
    private static final String commandTurnRight = "R";

    @Test
    void should_y_add_1_when_process_command_given_0_0_N_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionNorth);
        //when
        marsRover.processCommands(commandMoveForward);
        //then
        assertEquals(1, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionNorth, marsRover.getDirection());
    }

    @Test
    void should_y_minus_1_when_process_command_given_0_0_S_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionSouth);
        //when
        marsRover.processCommands(commandMoveForward);
        //then
        assertEquals(-1, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionSouth, marsRover.getDirection());
    }

    @Test
    void should_x_add_1_when_process_command_given_0_0_E_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionEast);
        //when
        marsRover.processCommands(commandMoveForward);
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(1, marsRover.getxLocation());
        assertEquals(directionEast, marsRover.getDirection());
    }

    @Test
    void should_x_minus_1_when_process_command_given_0_0_W_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionWest);
        //when
        marsRover.processCommands(commandMoveForward);
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(-1, marsRover.getxLocation());
        assertEquals(directionWest, marsRover.getDirection());
    }

    @Test
    void should_direction_change_E_when_process_command_given_0_0_N_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionNorth);
        //when
        marsRover.processCommands(commandTurnRight);
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionEast, marsRover.getDirection());
    }

    @Test
    void should_direction_change_S_when_process_command_given_0_0_E_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionEast);
        //when
        marsRover.processCommands(commandTurnRight);
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionSouth, marsRover.getDirection());
    }

    @Test
    void should_direction_change_W_when_process_command_given_0_0_S_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionSouth);
        //when
        marsRover.processCommands(commandTurnRight);
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionWest, marsRover.getDirection());
    }

    @Test
    void should_direction_change_N_when_process_command_given_0_0_W_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionWest);
        //when
        marsRover.processCommands(commandTurnRight);
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionNorth, marsRover.getDirection());
    }

    @Test
    void should_direction_change_W_when_process_command_given_0_0_N_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionNorth);
        //when
        marsRover.processCommands(commandTurnLeft);
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionWest, marsRover.getDirection());
    }

    @Test
    void should_direction_change_N_when_process_command_given_0_0_E_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionEast);
        //when
        marsRover.processCommands(commandTurnLeft);
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionNorth, marsRover.getDirection());
    }

    @Test
    void should_direction_change_E_when_process_command_given_0_0_S_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionSouth);
        //when
        marsRover.processCommands(commandTurnLeft);
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionEast, marsRover.getDirection());
    }

    @Test
    void should_direction_change_S_when_process_command_given_0_0_W_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionWest);
        //when
        marsRover.processCommands(commandTurnLeft);
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionSouth, marsRover.getDirection());
    }

    @Test
    void should_return_1_0_W_when_process_commands_given_0_0_N_MRMLRLM() {
        //given
        MarsRover marsRover = new MarsRover(0,0,directionWest);
        //when
        String commands = commandMoveForward + commandTurnRight + commandMoveForward + commandTurnLeft + commandTurnRight + commandTurnLeft + commandMoveForward;
        marsRover.processCommands(commands);
        //then
        assertEquals(1, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals(directionWest, marsRover.getDirection());
    }
}

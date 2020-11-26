package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_y_add_1_when_process_command_given_0_0_N_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionNorth);
        //when
        marsRover.processCommands(MarsRoverConstant.commandMoveForward);
        //then
        assertEquals(1, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionNorth, marsRover.getDirection());
    }

    @Test
    void should_y_minus_1_when_process_command_given_0_0_S_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionSouth);
        //when
        marsRover.processCommands(MarsRoverConstant.commandMoveForward);
        //then
        assertEquals(-1, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionSouth, marsRover.getDirection());
    }

    @Test
    void should_x_add_1_when_process_command_given_0_0_E_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionEast);
        //when
        marsRover.processCommands(MarsRoverConstant.commandMoveForward);
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(1, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionEast, marsRover.getDirection());
    }

    @Test
    void should_x_minus_1_when_process_command_given_0_0_W_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionWest);
        //when
        marsRover.processCommands(MarsRoverConstant.commandMoveForward);
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(-1, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionWest, marsRover.getDirection());
    }

    @Test
    void should_direction_change_E_when_process_command_given_0_0_N_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionNorth);
        //when
        marsRover.processCommands(MarsRoverConstant.commandTurnRight);
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionEast, marsRover.getDirection());
    }

    @Test
    void should_direction_change_S_when_process_command_given_0_0_E_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionEast);
        //when
        marsRover.processCommands(MarsRoverConstant.commandTurnRight);
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionSouth, marsRover.getDirection());
    }

    @Test
    void should_direction_change_W_when_process_command_given_0_0_S_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionSouth);
        //when
        marsRover.processCommands(MarsRoverConstant.commandTurnRight);
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionWest, marsRover.getDirection());
    }

    @Test
    void should_direction_change_N_when_process_command_given_0_0_W_R() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionWest);
        //when
        marsRover.processCommands(MarsRoverConstant.commandTurnRight);
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionNorth, marsRover.getDirection());
    }

    @Test
    void should_direction_change_W_when_process_command_given_0_0_N_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionNorth);
        //when
        marsRover.processCommands(MarsRoverConstant.commandTurnLeft);
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionWest, marsRover.getDirection());
    }

    @Test
    void should_direction_change_N_when_process_command_given_0_0_E_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionEast);
        //when
        marsRover.processCommands(MarsRoverConstant.commandTurnLeft);
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionNorth, marsRover.getDirection());
    }

    @Test
    void should_direction_change_E_when_process_command_given_0_0_S_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionSouth);
        //when
        marsRover.processCommands(MarsRoverConstant.commandTurnLeft);
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionEast, marsRover.getDirection());
    }

    @Test
    void should_direction_change_S_when_process_command_given_0_0_W_L() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionWest);
        //when
        marsRover.processCommands(MarsRoverConstant.commandTurnLeft);
        //then
        assertEquals(0, marsRover.getYLocation());
        assertEquals(0, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionSouth, marsRover.getDirection());
    }

    @Test
    void should_return_2_1_N_when_process_commands_given_0_0_N_MRMLRLM() {
        //given
        MarsRover marsRover = new MarsRover(0,0,MarsRoverConstant.directionNorth);
        //when
        String commands = MarsRoverConstant.commandMoveForward
                .concat(MarsRoverConstant.commandTurnRight)
                .concat(MarsRoverConstant.commandMoveForward)
                .concat(MarsRoverConstant.commandTurnLeft)
                .concat(MarsRoverConstant.commandTurnRight)
                .concat(MarsRoverConstant.commandTurnLeft)
                .concat(MarsRoverConstant.commandMoveForward);

        marsRover.processCommands(commands);
        //then
        assertEquals(2, marsRover.getYLocation());
        assertEquals(1, marsRover.getXLocation());
        assertEquals(MarsRoverConstant.directionNorth, marsRover.getDirection());
    }
}

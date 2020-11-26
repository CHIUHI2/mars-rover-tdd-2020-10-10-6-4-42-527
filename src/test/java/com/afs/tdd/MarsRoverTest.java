package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_y_add_1_when_process_command_given_0_0_N_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"N");
        //when
        marsRover.processCommands("M");
        //then
        assertEquals(1, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_y_minus_1_when_process_command_given_0_0_S_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"S");
        //when
        marsRover.processCommands("M");
        //then
        assertEquals(-1, marsRover.getyLocation());
        assertEquals(0, marsRover.getxLocation());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_x_add_1_when_process_command_given_0_0_E_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"E");
        //when
        marsRover.processCommands("M");
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(1, marsRover.getxLocation());
        assertEquals("E", marsRover.getDirection());
    }

    @Test
    void should_x_minus_1_when_process_command_given_0_0_W_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0,"W");
        //when
        marsRover.processCommands("M");
        //then
        assertEquals(0, marsRover.getyLocation());
        assertEquals(-1, marsRover.getxLocation());
        assertEquals("W", marsRover.getDirection());
    }
}

package com.kata.marsrover

import org.junit.Assert
import org.junit.Ignore
import org.junit.Test

class OnBoardComputerTest {

    @Test
    fun shouldMoveForwardOneStep() {
        val hall = OnBoardComputer(Position(0, 0), Direction.NORTH)
        hall.receiveInstructions("f")
        val hallPosition = hall.position
        Assert.assertEquals(hallPosition.x, 0)
        Assert.assertEquals(hallPosition.y, 1)
    }

    @Ignore("This test is still red")
    @Test
    fun shouldMoveBackwardOneStep() {
        val hall = OnBoardComputer(Position(0, 0), Direction.NORTH)
        hall.receiveInstructions("g")
        val hallPosition = hall.position
        Assert.assertEquals(hallPosition.x, 0)
        Assert.assertEquals(hallPosition.y, -1)
    }
}

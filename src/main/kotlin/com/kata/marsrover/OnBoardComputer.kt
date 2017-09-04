package com.kata.marsrover


class OnBoardComputer {
    var position: Position = Position(0, 0)
        get() {
            return field
        }
        set(value) {
            field = value
        }
    private var direction: Direction
        get() {
            return direction
        }

    constructor(position: Position, direction: Direction) {
        this.position = position
        this.direction = direction
    }

    fun receiveInstructions(s: String) {
        this.position = Position(0,1)
    }

}

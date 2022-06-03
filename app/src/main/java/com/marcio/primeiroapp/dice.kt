package com.marcio.primeiroapp

fun main() {

    data class Input(val numero1: Int, val numero2: Int)


    fun getInput(): Input {
        println("First enter Marcio's Number, Second enter Wendy's Number")

        val marcio = readLine() ?: "0"
        val parsedNumber1 = try {
            marcio.toInt()
        } catch (e: Exception) {
            println("That's not a valid number")
            0
        }

        val input1 = if (parsedNumber1 == 0) {
            getInput()
        } else {
            parsedNumber1
        }

        val wendy = readLine() ?: "0"
        val parsedNumber2 = try {
            wendy.toInt()
        } catch (e: Exception) {
            println("That's not a valid number")
            0
        }


        val input: Input = if (parsedNumber1 == 0 || parsedNumber2 == 0) {
            getInput()
        } else {
            Input(parsedNumber1, parsedNumber2)
        }

        return input
    }

    val values = getInput()

    val firstDice = Dice(6)
    val secondDice = Dice(6)

    val answer1 = firstDice.roll()
    val answer2 = secondDice.roll()

    if (values.numero1 == answer1) {
        println("Marcio you got it!")
    } else {
        println("Marcio you failed!")
    }
    if (values.numero2 == answer2) {
        println("Wendy you got it!")
    } else {
        println("Wendy you failed!")
    }
}

open class Dice(var sides: Int) {
    fun roll(): Int {
        val result = (1..sides).random()
        println("$result")
        return result
    }
}
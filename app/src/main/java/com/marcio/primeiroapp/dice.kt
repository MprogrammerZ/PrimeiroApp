

package com.marcio.primeiroapp

import java.lang.Exception

fun main(){

    println("First enter Marcio's Number, Second enter Wendy's Number")

    val marcio = readLine()?: "0"
    val parsedNumber1 = try {
        marcio.toInt()
    }catch(e: Exception){ 0 ; println("That's not a valid number")  }

    val wendy = readLine()?: "0"
    val parsedNumber2 = try {
        wendy.toInt()
    }catch(e: Exception){ 0 ; println("That's not a valid number") }

    val firstDice = Dice(6)
    val secondDice = Dice(6)

    val answer1 = firstDice.roll()
    val answer2 = secondDice.roll()

    if (parsedNumber1 == answer1){
        println("Marcio you got it!")}else{println("Marcio you failed!")}
    if (parsedNumber2 == answer2){
        println("Wendy you got it!")}else{println("Wendy you failed!")}
}

open class Dice(var sides: Int ) {
    fun roll(): Int {
        val result = (1..sides).random()
        println("$result")
        return result
    } }
package org.example.lesson_4

fun main() {

    val weatherToday: Boolean = true
    val nowTentOpen: Boolean = true
    val airDry: Int = 20
    val season: String = "зима"

    val total = weatherToday && nowTentOpen && airDry == 20 && season != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $total")
}
package org.example.lesson_4

fun main() {

    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    var airDry: Int = 20
    var season: String = "зима"
    val seasonNow = "зима"
    val airDryNow = 20
    val total = isSunny && isTentOpen && airDry == airDryNow && season != seasonNow
    println("Благоприятные ли условия сейчас для роста бобовых? $total")
}
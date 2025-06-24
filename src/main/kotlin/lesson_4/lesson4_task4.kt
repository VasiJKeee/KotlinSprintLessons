package org.example.lesson_4

fun main() {

    val Day = 5

    val isArmAndAbsDay = Day % 2 == 1
    println("""
        Упражнения для рук:    $isArmAndAbsDay
        Упражнения для ног:    ${!isArmAndAbsDay}
        Упражнения для спины:  ${!isArmAndAbsDay}
        Упражнения для пресса: $isArmAndAbsDay""".trimIndent())
}
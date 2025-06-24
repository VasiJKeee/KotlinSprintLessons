package org.example.lesson5

fun main() {
    val nowYear = 2025
    val adultAge = 18

    print("введите год рождения ")

    val userYear = readLine()?.toInt()
    val age = nowYear - userYear!!

    if (age >= adultAge) {
        println("Показать экран со скрытым контентом")
    }
}
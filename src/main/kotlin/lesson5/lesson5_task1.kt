package org.example.lesson5

fun main() {
    val scanner = readLine()

    val number1 = 1
    val number2 = 2
    val answer = number1 + number2

    println("Докажите, что вы не бот! Решите пример:")
    println("$number1 + $number2 = ?")
    println("Введите ответ: ")

    val userAnswer = readLine()?.toInt()

    if (userAnswer == answer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
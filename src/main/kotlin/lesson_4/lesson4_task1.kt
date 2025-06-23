package org.example.lesson_4

fun main() {

    val allTables = 13
    val today = 13
    val tomorrow = 9

    val availableToday = today < allTables
    val availableTomorrow = tomorrow < allTables

    println("Доступно сегодня: $availableToday \nДоступно завтра: $availableTomorrow")

}
package org.example.lesson_2

fun main(){
    var ratings = intArrayOf(3, 4, 3, 5)
    var averageScore = ratings.sum().toDouble() / ratings.size

    println(averageScore)
}

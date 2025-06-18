package org.example.lesson_2

fun main(){
    var ratings = intArrayOf(3, 4, 3, 5)
    var b   = 0.00
    for(i in ratings) {
        b = b + i
    }
    var averageScore:Double = b / ratings.size

println(averageScore)
}

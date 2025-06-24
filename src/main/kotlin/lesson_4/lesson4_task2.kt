package org.example.lesson_4

fun main() {

    var minWeight = 35
    var maxWeight = 100
    var maxVolume = 100

    var weight = 20
    var volume = 80
    var check = weight > minWeight && weight <= maxWeight && volume < maxVolume
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " + check)

    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " + check)

}
package org.example.lesson_2

fun main(){

   val departureHour = 9
      val departureMinute = 39
      val travelTimeMinutes = 457

      val totalDepartureMinutes = departureHour * 60 + departureMinute
      val totalArrivalMinutes = totalDepartureMinutes + travelTimeMinutes
      val arrivalHour = (totalArrivalMinutes / 60) % 24
      val arrivalMinute = totalArrivalMinutes % 60

   println("Время прибытия поезда: $arrivalHour:$arrivalMinute")
}


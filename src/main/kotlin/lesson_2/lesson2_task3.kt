package org.example.lesson_2

fun main(){

   val departureHour = 9
   val departureMinute = 39
   val travelTimeMinutes = 457
   val minInHour = 60
   val hoursInDay = 24

      val totalDepartureMinutes = departureHour * minInHour + departureMinute
      val totalArrivalMinutes = totalDepartureMinutes + travelTimeMinutes
      val arrivalHour = (totalArrivalMinutes / minInHour) % hoursInDay
      val arrivalMinute = totalArrivalMinutes % minInHour

   println("Время прибытия поезда: $arrivalHour:$arrivalMinute")
}


package org.example.lesson_2

fun main(){

   var crystal = 7
   var iron = 11
   var buff = 20
   var oneHundredConvertPercentage = 100
   var bonusCrystal = (crystal * buff) / oneHundredConvertPercentage.toInt()
   var bonusIron = (iron * buff) / oneHundredConvertPercentage.toInt()
   println("bonusCrystal $bonusCrystal bonusIron $bonusIron")
}


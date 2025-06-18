package org.example.lesson_2

fun main(){
   var allParty = 50
    var allPartyMoney = 30000
    var CountJun = 30
    var CountJunMoney = 20000

    var allPartyMoneyInM = allParty * allPartyMoney
    var allPartyMoneyWithcJunInM = CountJun * CountJunMoney + allPartyMoneyInM
    var averageSalary = allPartyMoneyWithcJunInM / (allParty + CountJun)
    println(averageSalary)
}


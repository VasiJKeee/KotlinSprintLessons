package org.example.lesson_2

fun main(){
    var allParty = 50
    var allPartyMoney = 30000
    var countJun = 30
    var countJunMoney = 20000

    var allPartyMoneyInM = allParty * allPartyMoney
    var allPartyMoneyWithcJunInM = countJun * countJunMoney + allPartyMoneyInM
    var averageSalary = allPartyMoneyWithcJunInM / (allParty + countJun)
    println(averageSalary)
}



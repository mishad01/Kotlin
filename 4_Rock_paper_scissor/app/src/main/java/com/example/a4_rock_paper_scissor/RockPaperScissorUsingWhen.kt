package com.example.a4_rock_paper_scissor

fun main() {
    var computerChoice = ""
    var playerChoice = ""
    playerChoice = readln()
    while (true) {
        println("Rock, Paper or Scissor? Enter Your choice!")
        playerChoice = readln()
        val randomNumber = (1..3).random()

        when (randomNumber) {
            1 -> computerChoice = "Rock"
            2 -> computerChoice = "Paper"
            3 -> computerChoice = "Scissor"
        }

        val winner = when {
            playerChoice == computerChoice -> "It's a draw"
            playerChoice == "Rock" && computerChoice == "Scissor" -> "Player Won"
            playerChoice == "Paper" && computerChoice == "Rock" -> "Player Won"
            playerChoice == "Scissor" && computerChoice == "Paper" -> "Player Won"
            else -> "Computer won"
        }

        println("Player: $playerChoice")
        println("Computer: $computerChoice")

        println(winner)
        println("--------------------")
    }
}

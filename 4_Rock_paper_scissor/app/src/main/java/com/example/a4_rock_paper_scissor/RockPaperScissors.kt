package com.example.a4_rock_paper_scissor

fun main(){
    var computerChoice = "";
    var playerChoice = "";
    println("Rock, Paper or Scissor? Enter Your choice!");
    playerChoice = readln();
    val randomNumber = (1..3).random();

    if(randomNumber == 1){
        computerChoice = "Rock";
    }else if (randomNumber ==2){
        computerChoice = "Paper";
    }else if(randomNumber==3){
        computerChoice = "Scissor";
    }
    println(playerChoice);
    println(computerChoice);

}
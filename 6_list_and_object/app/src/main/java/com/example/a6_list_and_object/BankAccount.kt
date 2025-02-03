package com.example.a6_list_and_object

class BankAccount (var accountHolder : String, var balance : Double) {

    private  val transactionHistory = mutableListOf<String>()

    fun deposit(amount : Double){
        balance +=amount;
        transactionHistory.add("$accountHolder deposited $$amount")
    }
    fun withdraw(amount: Double){
        if(amount<=balance){
            balance -=amount;
            transactionHistory.add("$accountHolder withdrew $$amount")
        }else{
            transactionHistory.add("You don't have enough found to withdraw")
        }
    }
    fun displayTransactionHistory(){
        for(item in transactionHistory){
            println(item);
        }
    }
}
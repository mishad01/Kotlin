package com.example.a6_list_and_object

fun main(){
    val denisesBankAccount = BankAccount("Denis Panujta",1338.2)
    println(denisesBankAccount.accountHolder)
    denisesBankAccount.deposit(200.20)
    denisesBankAccount.withdraw(50.0)
    denisesBankAccount.displayTransactionHistory()
    println(denisesBankAccount.balance)

}
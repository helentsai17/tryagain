package com.tom

import java.util.*

fun main(args: Array<String>) {
    val secret = Random().nextInt(10)+1
    println(secret)
  //  val scanner = Scanner(System.`in`)
    var number = 0
    while (number != secret){
    println("please enter the number")
//    number = scanner.nextInt()
        number = readLine()!!.toInt()
        if (number > secret){
            println("lower")
        }else if (number <secret){
            println("higher")
        }else{
            println(" you got is, the number is $secret")
        }
}
}
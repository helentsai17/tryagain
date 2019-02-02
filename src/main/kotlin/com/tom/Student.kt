package com.tom

import java.util.*

fun main(args: Array<String>) {
    val stu = Student("Jack", 66, 99)
    stu.print()
    println("highest score ${stu.highest()}")

    //userInput()
}

class Student(var name:String, var english : Int, var math :Int){
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")

    }
    fun getAverage() = (english+math)/2

    fun passOrFailed() = if (getAverage()>=60)"\tpass" else "\tfailed"

    fun highest() = if (english>math) english else math

    fun grading() = when(getAverage()){
            in 90..100 ->'A'
            in 80..89 ->'B'
            in 70..79 ->'C'
            in 60..69 ->'D'
            else -> 'F'
        }

//   方法二 fun grading() : Char{
//        return when(getAverage()){
//            in 90..100 ->'A'
//            in 80..89 ->'B'
//            in 70..79 ->'C'
//            in 60..69 ->'D'
//            else -> 'F'

//   方法一     var grading = when(getAverage()){
//            in 90..100 ->'A'
//            in 80..89 ->'B'
//            in 70..79 ->'C'
//            in 60..69 ->'D'
//            else -> 'F'
//        }
//        return grading



//      if(english>math){
        //print("english")
//        max = english
//        }else{
//           //print("math")
//            max = math
//        }


private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please Enter you name:")
    var name = scanner.next()
    print("Please Enter you english:")
    var english = scanner.nextInt()
    print("plase enter your math score:")
    var math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
}}



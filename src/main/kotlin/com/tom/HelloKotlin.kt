package com.tom

fun main(args: Array<String>) {
    var s:String? = "abcde"
   // s=null
    println(s?.length)//!!自己處理
    println(s?.get(3))//得到字串中的字元，java中用charAt方法
    println(s?.substring(3))//substring取得子字串的字元


}
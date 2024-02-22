package com.example.nopedope

class MainActivity {
    fun main(){
        println("Enter number 1")
        val num1Str= readln()
        val num1Int=num1Str.toInt()
        println("Enter number 2")
        val num2Int =readln().toInt()

        val myResult = add(num1Int,num2Int)
        println(myResult)

    }
    fun add(num1:Int,num2:Int):Int{
        val result = num1+num2
        return result
    }
}
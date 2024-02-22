package com.shubhamdevpro.secondapp
fun main(){
    var myName = "Shubham Dev"
    /*
    val myFloat = 3.14F
    val myDouble = 3.123247890922233
    var isSunny = true
    var notSunny = false
    val letterChar = '$'
    val myStr = "Hello World"
    val firstChar = myStr[0]
    val lastChar = myStr[myStr.length -1]
    val int = 3
    val short = 125
    // type inference finds out type from context*/
    print("Hello $myName")
    println("Hello, world!!!")
    // This is a comment. Comments start with //
    // val is used for variables which are immutable (not changable)
    myName = "Denis"
    // myName = "Michael" // ERROR: Val cannot be reassigned

    /* This is a multi line comment starts with /* and ends with *'/ without the '
     var is used for variables which are mutable/changeable.
     kotlin is a strongly typed language that supports Type Inference.
     The compiler will directly assume the size and type to a variable by that.
     For example, if you assign any whole number to a variable,
     the compiler will directly assume that the variable is of type Int
    */ */
    var myAge = 31

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    print("Length of my name is ${myName.length}") // String template expression
    var result = 3+5
    result /=2
    print(result)
    val isEqual = 5==3
    print("is 5 greater than 3 ${5>3}")
    println("isEqual is $isEqual")
    print("is 5 greater than equal to 5 ${5>=5}")

    var myNum = 5
    print("myNum is ${myNum++}") // output is 5
    print("myNum is ${++myNum}") //output is 7
    print("myNum is ${--myNum}") //output is 6

    val heightPerson1 = 170
    val heightPerson2 = 190
    if(heightPerson1>heightPerson2){
        println("Use Raw Force")
    }
    else if(heightPerson1==heightPerson2){
        println("It's a draw ")
    }
    else{
        println("Use Technique")
    }
    //create a variable for testing all condition
    val age = 16
//create a variable for drinkingAge
    val drinkingAge = 21
//create a variable for votingAge
    val votingAge = 18
//create a variable for drivingAge
    val drivingAge = 16

//Assign the if statement to a variable
    val currentAge =  if (age >=drinkingAge){
        println("Now you may drink in the US")
//return the value for this block
        drinkingAge
    }else if(age >=votingAge){
        println("You may vote now")
//return the value for this block
        votingAge
    }else if (age>=drivingAge){
        println("You may drive now")
//return the value for this block
        drivingAge
    }else{
        println("You are too young")
//return the value for this block
        age
    }
//print the age for the passing condition
    print("current age is $currentAge")
    val season = 3
    when(season){
        1-> println("Winter")
        2-> println("Summer")
        3->{
            println("Autumn")
            println("Autumn is the best season")
        }
        4->println("End of Year")
        else->{
            println("Invalid Season")
        }
    }
    var month = 3
    when(month){
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 8..12 -> println("Fall")
        //12 downTo 2 -> println("Winter")
        12,1,2 -> println("Winter")
        else -> print("Invalid Season")

    }
    var x: Any = 13.37 // x is a double
    // var x: Any = 13.37f will make x a float
    when(x){
    is Int  -> println("$x is an integer")
    is Float -> println("$x is a Float")
    is String -> println("$x is a string")
    is Double -> println("$x is a double")
    else -> print("$x is not any of the above")
    }
}
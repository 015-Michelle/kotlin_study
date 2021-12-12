package com.example.myapplication.example.first

//Kotlin泛型
fun main() {
    //1.泛型接口
    val drinkApple=DrinkApple()
    drinkApple.drink("drink")
    //2.泛型类
    val blueColor=BlueColor("blue")
    blueColor.printColor()
    //3.泛型字段

    //4.泛型方法
    
}

interface Drink<T>{
    fun drink(t:T)
}

class DrinkApple:Drink<String>{
    override fun drink(t: String) {
        println("drink:${t}")
    }
}

abstract class  Color<T>(val t:T){
    abstract fun printColor()
}

class BlueColor(val color:String):Color<String>(color){
    override fun printColor() {
        println("color:${color}")
    }

}
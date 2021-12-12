package com.example.myapplication.example.first

import java.lang.Exception
import kotlin.system.exitProcess

fun main() {
    while (true){
        println("=======请输入表达式======")
        val inputString:String? = readLine()
        try {
            inputString?.let {
                val ret= calculateResult(it)
                println("【计算结果】：$ret")
                println("【是否继续计算？y/n】")
                run continues@{
                while (true){
                    val nextOperation:String?= readLine()
                    nextOperation?.let {
                        if(nextOperation=="n"){
                            //退出程序
                            //System.exit(-1)
                            exitProcess(-1)
                        }else if(nextOperation=="y"){
                            return@continues
                        }else{
                            println("（输入错误，请重新输入!!!）")
                        }
                    }
                }
            }
            }
        }catch (ex:Exception){
            ex.printStackTrace()
        }
    }

}

fun calculateResult(input:String):String{

    if(input.contains("+")){
        val nums=input.trim().split('+')
        return operate(nums[0].toDouble(),nums[1].toDouble(),"+").toString()
    }else if(input.contains("-")){
        val nums=input.trim().split('-')
        return operate(nums[0].toDouble(),nums[1].toDouble(),"-").toString()
    }else if(input.contains("*")){
        val nums=input.trim().split('*')
        return operate(nums[0].toDouble(),nums[1].toDouble(),"*").toString()
    }else if(input.contains("/")){
        val nums=input.trim().split('/')
        return operate(nums[0].toDouble(),nums[1].toDouble(),"*").toString()
    }else if(input.contains("%")){
        val nums=input.trim().split('%')
        return operate(nums[0].toDouble(),nums[1].toDouble(),"/").toString()
    }else{
        return "error,please cehck your input"
    }
}

fun  operate(a:Double, b:Double, operateStr: String):Double{
    return when(operateStr){
        "+"->a+b
        "-"->a-b
        "*"->a*b
        "/"->a/b
        "%"->a%b
        else->0.0
    }
}